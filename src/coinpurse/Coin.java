package coinpurse;

/**
 * A coin with a monetary value and currency.
 * 
 * @author Archawin Tirugsapun
 */
public class Coin implements Comparable<Coin>, Valuable {
	public static final String DEFAULT_CURRENCY = "Baht";
	/** Value of the coin. */
	private final double value;
	/** The currency, of course. */
	private final String currency;

	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 */
	public Coin(double value) {
		this.value = value;
		this.currency = "Baht";
	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;
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
	 * Check that two coin are equal or not by its currency and value of coin.
	 * 
	 * @param obj
	 *            other object that use to compare.
	 * 
	 * @return true if 2 coins are equal.
	 */
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Coin coins = (Coin) obj;
		if (this.getCurrency() == coins.getCurrency()
				&& this.getValue() == coins.getValue())
			return true;
		return false;
	}

	/**
	 * Check coin with other coin by its value if this coin has more value than
	 * other coin it will return 1, it return 0 if two have the same value, and
	 * -1 if other coin has more value than this coin or other value is null.
	 * 
	 * @param o
	 *            other coin that use to compare.
	 * 
	 * @return if this coin has more value than other coin it will return 1, it
	 *         return 0 if two have the same value, and -1 if other coin has
	 *         more value than this coin or other value is null.
	 */
	@Override
	public int compareTo(Coin o) {
		if (o == null)
			return -1;
		return (int) Math.signum(this.getValue() - o.getValue());
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