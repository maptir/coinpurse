package coinpurse;

public class BankNote implements Valuable {
	private final double value;
	private static long nextSerialNumber = 1000000;
	private final long serialNumber;
	private final String currency;

	public BankNote(double value) {
		this.value = value;
		this.serialNumber = nextSerialNumber;
		nextSerialNumber++;
		currency = "Baht";
	}

	public BankNote(double value, String currency) {
		this.value = value;
		this.currency = currency;
		this.serialNumber = nextSerialNumber;
		nextSerialNumber++;
	}

	@Override
	public double getValue() {
		return value;
	}

	@Override
	public String getCurrency() {
		return currency;
	}

	public long getSerial() {
		return serialNumber;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		BankNote bank = (BankNote) obj;
		if (this.getCurrency() == bank.getCurrency()
				&& this.getValue() == bank.getValue())
			return true;
		return false;
	}

	public String toString() {
		return value + "-" + currency + "[" + serialNumber + "]";
	}
}
