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

	public long getSerial() {
		return serialNumber;
	}

	public String toString() {
		return value + " " + currency + " note [" + serialNumber + "]";
	}
}
