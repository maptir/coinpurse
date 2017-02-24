package coinpurse;

public class BankNote extends AbstractValuable {
	private static long nextSerialNumber = 1000000;
	private long serialNumber;

	public BankNote(double value) {
		super(value);
		this.serialNumber = nextSerialNumber;
		nextSerialNumber++;
	}

	public BankNote(double value, String currency) {
		super(value, currency);
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

	public String toString() {
		return value + "-" + currency + "[" + serialNumber + "]";
	}
}
