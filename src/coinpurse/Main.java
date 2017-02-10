package coinpurse;

import java.util.Collections;

/**
 * A main class to create objects and connect objects together. The user
 * interface needs a reference to coin purse.
 * 
 * @author your name
 */
public class Main {

	/**
	 * Configure and start the application.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		// TODO follow the steps in the sequence diagram
		// 1. create a Purse
		Purse purse = new Purse(3);
		// 2. create a ConsoleDialog with a reference to the Purse object
		System.out.println(purse.getBalance());
		System.out.println(purse.count());
		System.out.println(purse.isFull());
		System.out.println(purse.insert(new Coin(5)));
		System.out.println(purse.insert(new Coin(10)));
		System.out.println(purse.insert(new Coin(0)));
		System.out.println(purse.insert(new Coin(1)));
		System.out.println(purse.insert(new Coin(5)));
		System.out.println(purse.count());
		System.out.println(purse.isFull());
		System.out.println(purse.getBalance());
		System.out.println(purse);
		System.out.println(purse.withdraw(12));
		System.out.println(purse.withdraw(11));
		// 3. run the ConsoleDialog
		ConsoleDialog ui = new ConsoleDialog(purse);
		ui.run();
	}
}
