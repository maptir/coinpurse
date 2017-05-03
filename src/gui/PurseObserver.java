package gui;

import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import coinpurse.Purse;

public class PurseObserver extends JFrame implements Observer {
	private JTextArea textArea;

	public PurseObserver() {

	}

	public void initcomponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(0, 75);
		textArea = new JTextArea(5, 30);
		textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.add(scrollPane);
		this.pack();
	}

	public void run() {
		initcomponents();
		setVisible(true);
	}

	public void update(Observable subject, Object info) {
		if (info != null)
			textArea.append(info + "\n");
		if (subject instanceof Purse) {
			Purse purse = (Purse) subject;
			textArea.append("Balance is: " + purse.getBalance() + "\n");
		}
	}
}
