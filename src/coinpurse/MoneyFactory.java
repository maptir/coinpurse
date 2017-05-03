package coinpurse;

/**
 * Factory that will create an valuable coin and banknote if possible for any
 * country that use this factory.
 * 
 * @author Archawin Tirugsapun
 *
 */
public abstract class MoneyFactory {
	private static MoneyFactory factory;
	long nextSerialNumber = 1000000;

	/**
	 * Get an instance of moneyfactory class that can
	 * 
	 * @return factory
	 */
	public static MoneyFactory getInstance() {
		return factory;
	}

	/**
	 * Create to override in many country that didn't have the same currency.
	 * 
	 * @param value
	 *            money that user input.
	 * @return Valuable
	 */
	abstract Valuable createMoney(double value);

	/**
	 * There are 2 way to create money user can input it with double or string
	 * if user put in string this method will check that user input only number
	 * or not ex. "a50" it will not create money.
	 * 
	 * @param value
	 *            that user input in string.
	 * @return Valuable if string have only a number.
	 */
	Valuable createMoney(String value) {
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException();
		}
		return createMoney(Double.parseDouble(value));
	}

	/**
	 * Set factory from file purse.properties if it have.
	 */
	static void setMoneyFactory(MoneyFactory setFactory) {
		factory = setFactory;
	}
}
