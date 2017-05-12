package coinpurse;

import java.util.ResourceBundle;

import coinpurse.gui.PurseBalanceObserver;
import coinpurse.gui.PurseListModel;
import coinpurse.gui.PurseStatusObserver;
import coinpurse.strategy.GreedyWithdraw;
import coinpurse.strategy.RecursiveWithdraw;

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
		ResourceBundle bundle = ResourceBundle.getBundle("purse");
		String factoryclass = bundle.getString("moneyfactory");
		MoneyFactory factory = null;
		try {
			factory = (MoneyFactory) Class.forName(factoryclass).newInstance();
		} catch (ClassCastException cce) {
			System.out.println(factoryclass + " is not type MoneyFactory.");
		} catch (Exception ex) {
			System.out
					.println("Error creating MoneyFactory " + ex.getMessage());
		}
		MoneyFactory.setMoneyFactory(factory);

		Purse purse = new Purse(CAPACITY);
		ConsoleDialog ui = new ConsoleDialog(purse);
		GreedyWithdraw greedy = new GreedyWithdraw();
		RecursiveWithdraw recur = new RecursiveWithdraw();
		purse.setStrategy(recur);

		PurseBalanceObserver balanceObserver = new PurseBalanceObserver();
		PurseStatusObserver statusObserver = new PurseStatusObserver();
		PurseListModel listmodel = new PurseListModel(purse);

		purse.addObserver(listmodel);
		purse.addObserver(balanceObserver);
		purse.addObserver(statusObserver);

		listmodel.run();
		balanceObserver.run();
		statusObserver.run();
		ui.run();
	}
}