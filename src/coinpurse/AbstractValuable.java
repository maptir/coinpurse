package coinpurse;

public class AbstractValuable implements Valuable {
	double value;
	String currency;

	public AbstractValuable(double value) {
		this.value = value;
		this.currency = "Baht";
	}

	public AbstractValuable(double value, String currency) {
		this.value = value;
		this.currency = currency;
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
		Valuable other = (Valuable) obj;
		if (this.getCurrency().equals(other.getCurrency())
				&& this.getValue() == other.getValue())
			return true;
		return false;
	}

	/**
	 * Return the value of the coin.
	 * 
	 * @return value of the coin.
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * Return coin currency.
	 * 
	 * @return coin currency.
	 */
	@Override
	public String getCurrency() {
		return currency;
	}

	public int compareTo(Valuable o) {
		if (this.currency.equals(o.getCurrency()))
			return (int) Math.signum(this.getValue() - o.getValue());
		return this.getCurrency().compareTo(o.getCurrency());
	}
}