package coinpurse;

/**
 * A banknote with a value, currency and serial number.
 * 
 * @author Archawin Tirugsapun
 */
public class BankNote extends AbstractValuable {
	private long serialNumber;

	/**
	 * A banknote with given value using the default currency.
	 * 
	 * @param value
	 */
	public BankNote(double value) {
		super(value);
	}

	/**
	 * A banknote with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public BankNote(double value, String currency) {
		super(value, currency);
	}

	/**
	 * A banknote with given value using the default currency and serialnumber.
	 * 
	 * @param value
	 * @param serialNumber
	 */
	public BankNote(double value, long serialNumber) {
		super(value);
		this.serialNumber = serialNumber;
	}

	/**
	 * A banknote with given value, currency and serialnumber.
	 * 
	 * @param value
	 * @param currency
	 * @param serialNumber
	 */
	public BankNote(double value, String currency, long serialNumber) {
		super(value, currency);
		this.serialNumber = serialNumber;
	}

	public String toString() {
		return value + " " + currency + " note [" + serialNumber + "]";
	}
}
