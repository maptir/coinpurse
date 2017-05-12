package coinpurse.gui;

import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import coinpurse.Purse;

public class PurseBalanceObserver extends JFrame implements Observer {
	private JTextArea textArea;

	public void initcomponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		textArea = new JTextArea(1, 1);
		textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
		textArea.setText(0.0 + " Baht");
		this.add(textArea);
		this.pack();
	}

	public void run() {
		initcomponents();
		setVisible(true);
	}

	@Override
	public void update(Observable subject, Object info) {
		if (subject instanceof Purse) {
			Purse purse = (Purse) subject;
			textArea.setText(purse.getBalance() + " Baht");
		}
	}

}
