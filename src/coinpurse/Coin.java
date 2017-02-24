package coinpurse;

/**
 * A coin with a monetary value and currency.
 * 
 * @author Archawin Tirugsapun
 */
public class Coin extends AbstractValuable {
	public static final String DEFAULT_CURRENCY = "Baht";

	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 */
	public Coin(double value) {
		super(value);
	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public Coin(double value, String currency) {
		super(value, currency);
	}

	/**
	 * Return the value of the coin.
	 * 
	 * @return value of the coin.
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Return coin currency.
	 * 
	 * @return coin currency.
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Return string information from it value and currency.
	 * 
	 * @return string information from it value and currency.
	 */
	public String toString() {
		return value + "-" + currency;
	}
}