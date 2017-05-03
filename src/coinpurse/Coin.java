package coinpurse;

/**
 * A coin with a monetary value and currency.
 * 
 * @author Archawin Tirugsapun
 */
public class Coin extends AbstractValuable {
	public static final String DEFAULT_CURRENCY = "Baht";
	/**
	 * A specialCurrency is currency that have other name to call it like 0.5
	 * baht we call it "50 Satang" there are many currency like this.
	 */
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

	/**
	 * Set specialCurrency if that currency have the special one.
	 * 
	 * @param specialCurrency
	 */
	public void setSpecialCurrency(String specialCurrency) {
		this.specialCurrecny = specialCurrency;
	}

	public String toString() {
		if (value < 1 && specialCurrecny != null) {
			return value * 100 + " " + specialCurrecny + " coin";
		}
		return value + " " + currency + " coin";
	}
}