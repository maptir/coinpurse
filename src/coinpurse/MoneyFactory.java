package coinpurse;

import java.util.ResourceBundle;

public abstract class MoneyFactory {
	private static MoneyFactory factory;

	public static MoneyFactory getInstance() {
		setMoneyFactory();
		return factory;
	}

	public abstract Valuable createMoney(double value);

	public Valuable createMoney(String value) {
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException();
		}
		return createMoney(Double.parseDouble(value));
	}

	public static void setMoneyFactory() {
		if (factory == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("purse");
			String factoryclass = bundle.getString("moneyfactory");
			try {
				factory = (MoneyFactory) Class.forName(factoryclass)
						.newInstance();
			} catch (ClassCastException cce) {
				System.out.println(factoryclass + " is not type MoneyFactory.");
			} catch (Exception ex) {
				System.out.println("Error creating MoneyFactory "
						+ ex.getMessage());
			}
		}
	}
}
