package coinpurse.gui;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import coinpurse.Purse;
import coinpurse.Valuable;

public class PurseListModel extends AbstractListModel<Valuable> implements
		Observer {
	List<Valuable> money;
	JList<Valuable> listview;
	JFrame frame;

	public PurseListModel(Purse purse) {
		this.money = purse.purseList();
		frame = new JFrame("List Model");
		frame.setLocation(0, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void initcomponents() {
		listview = new JList<>(this);
		JScrollPane scroll = new JScrollPane(listview);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frame.add(scroll);
		frame.pack();
	}

	public void run() {
		initcomponents();
		frame.setVisible(true);
	}

	@Override
	public int getSize() {
		return money.size();
	}

	@Override
	public Valuable getElementAt(int index) {
		return money.get(index);
	}

	@Override
	public void update(Observable subject, Object info) {
		if (subject instanceof Purse) {
			Purse purse = (Purse) subject;
			fireContentsChanged(this, 0, this.getSize() - 1);
		}
	}

}
