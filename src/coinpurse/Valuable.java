package coinpurse;

/**
 * Interface for coin and banknote.
 * 
 * @author Archawin Tirugsapun
 *
 */
public interface Valuable extends Comparable<Valuable> {
	/**
	 * Return the value of the coin.
	 * 
	 * @return value of the coin.
	 */
	public double getValue();

	/**
	 * Return coin currency.
	 * 
	 * @return coin currency.
	 */
	public String getCurrency();

	/**
	 * Check that two valuable are equal or not by its currency and value of
	 * valuable.
	 * 
	 * @param obj
	 *            other object that use to compare.
	 * 
	 * @return true if 2 coins are equal.
	 */
	public boolean equals(Object obj);

	/**
	 * Return string information from it value and currency.
	 * 
	 * @return string information from it value and currency.
	 */
	public String toString();
}
