package coinpurse;

//TODO fix this Javadoc. It should be written as a COMPLETE SENTENCE WITH PERIOD.
/**
 * a coin with a monetary value and currency
 * 
 * @author Archawin Tirugsapun
 */
// TODO declare that Coin implements Comparable<Coin>
public class Coin implements Comparable<Coin> {
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

	// TODO Write a getValue() method and javadoc.
	public double getValue() {
		return value;
	}

	// TODO Write a getCurrency() method and javadoc.
	public String getCurrency() {
		return currency;
	}

	// TODO Write an equals(Object) method.
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

	// TODO Write a compareTo method and implement Comparable.

	// TODO write a toString() method. See labsheet for what to return.
	public String toString() {
		return value + "-" + currency;
	}

	@Override
	public int compareTo(Coin o) {
		if (o == null)
			return -1;
		return (int) Math.signum(this.getValue() - o.getValue());
	}

	// TODO Write good Javadoc comments on all methods.

}
// TODO remove the TODO comments after you complete them! Including this one!
