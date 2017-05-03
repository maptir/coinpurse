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

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Valuable other = (Valuable) obj;
		if (this.getCurrency().equals(other.getCurrency()) && this.getValue() == other.getValue())
			return true;
		return false;
	}

	@Override
	public double getValue() {
		return value;
	}

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