package coinpurse;

import gui.PurseBalanceObserver;
import gui.PurseObserver;
import gui.PurseStatusObserver;

/**
 * A main class to create objects and connect objects together. The user
 * interface needs a reference to coin purse.
 * 
 * @author Archawin Tirugsapun
 */
public class Main {
	private static final int CAPACITY = 10;

	/**
	 * Configure and start the application.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		Purse purse = new Purse(CAPACITY);
		// PurseObserver observer = new PurseObserver();
		PurseBalanceObserver balanceObserver = new PurseBalanceObserver();
		PurseStatusObserver statusObserver = new PurseStatusObserver();

		// purse.addObserver(observer);
		purse.addObserver(balanceObserver);
		purse.addObserver(statusObserver);
		ConsoleDialog ui = new ConsoleDialog(purse);
		// observer.run();
		balanceObserver.run();
		statusObserver.run();
		ui.run();
	}
}