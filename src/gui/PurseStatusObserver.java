package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import coinpurse.Purse;

public class PurseStatusObserver extends JFrame implements Observer {
	private JTextArea textArea;
	private JProgressBar pBar;

	public void initcomponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		textArea = new JTextArea(1, 5);
		pBar = new JProgressBar();
		textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
		textArea.setText("EMPTY");

		pBar.setMinimum(0);
		pBar.setMaximum(5);

		this.add(textArea, BorderLayout.NORTH);
		this.add(pBar, BorderLayout.SOUTH);

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
			pBar.setMaximum(purse.getCapacity());
			pBar.setValue(purse.count());
			if (purse.isFull())
				textArea.setText("FULL");
			else if (purse.count() == 0)
				textArea.setText("EMPTY");
			else
				textArea.setText(purse.count() + "");
		}
	}

}
