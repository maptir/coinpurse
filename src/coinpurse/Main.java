package coinpurse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import conipurse.strategy.GreedyWithdraw;
import conipurse.strategy.RecursiveWithdraw;
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
		// ResourceBundle bundle = ResourceBundle.getBundle("purse");
		// String factoryclass = bundle.getString("moneyfactory");
		// MoneyFactory factory = null;
		// try {
		// factory = (MoneyFactory) Class.forName(factoryclass).newInstance();
		// } catch (ClassCastException cce) {
		// System.out.println(factoryclass + " is not type MoneyFactory.");
		// } catch (Exception ex) {
		// System.out
		// .println("Error creating MoneyFactory " + ex.getMessage());
		// }
		// MoneyFactory.setMoneyFactory(factory);
		//
		// Purse purse = new Purse(CAPACITY);
		// ConsoleDialog ui = new ConsoleDialog(purse);
		// GreedyWithdraw greedy = new GreedyWithdraw();
		// RecursiveWithdraw recur = new RecursiveWithdraw();
		// purse.setStrategy(recur);
		//
		// PurseObserver observer = new PurseObserver();
		// PurseBalanceObserver balanceObserver = new PurseBalanceObserver();
		// PurseStatusObserver statusObserver = new PurseStatusObserver();
		//
		// purse.addObserver(observer);
		// purse.addObserver(balanceObserver);
		// purse.addObserver(statusObserver);
		//
		// observer.run();
		// balanceObserver.run();
		// statusObserver.run();
		// ui.run();
		RecursiveWithdraw recursiveWithdraw = new RecursiveWithdraw();
		List<Valuable> money = new ArrayList<Valuable>();
		money.add(new Coin(10));
		money.add(new Coin(5));
		money.add(new Coin(2));
		money.add(new Coin(2));
		money.add(new Coin(2));
		System.out.println(Arrays.toString(recursiveWithdraw
				.withdraw(11, money).toArray()));
	}
}