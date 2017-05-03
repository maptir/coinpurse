package coinpurse;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractListModel;

public class PurseListModel extends AbstractListModel<Valuable> implements Observer {
	List<Valuable> money;

	public PurseListModel(Purse purse) {
		this.money = purse.purseList();
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
