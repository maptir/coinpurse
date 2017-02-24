package coinpurse;

/**
 * A coin with a monetary value and currency.
 * 
 * @author Archawin Tirugsapun
 */
public class Coin extends AbstractValuable {
	public static final String DEFAULT_CURRENCY = "Baht";
	public String specialCurrecny;

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

	public void setSpecialCurrency(String specialCurrency) {
		this.specialCurrecny = specialCurrency;
	}

	/**
	 * Return string information from it value and currency.
	 * 
	 * @return string information from it value and currency.
	 */
	public String toString() {
		if (super.getValue() < 1) {
			return super.getValue() * 100 + " " + specialCurrecny + " coin";
		}
		return super.getValue() + " " + currency + " coin";
	}
}