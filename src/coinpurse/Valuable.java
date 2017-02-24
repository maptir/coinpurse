package coinpurse;

/**
 * 
 * @author User
 *
 */
public interface Valuable extends Comparable<Valuable> {
	/**
	 * 
	 * @return
	 */
	public double getValue();

	/**
	 * 
	 * @return
	 */
	public String getCurrency();

	/**
	 * 
	 */
	public boolean equals(Object obj);

	/**
	 * 
	 */
	public String toString();
}
