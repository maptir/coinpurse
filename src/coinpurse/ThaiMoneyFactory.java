package coinpurse;

/**
 * Create money in coin and banknote in Thai currency
 * 
 * @author Archawin Tirugsapun
 *
 */
public class ThaiMoneyFactory extends MoneyFactory {

	/**
	 * Create money if it possible by its value and it have two type coin and
	 * banknote if value is less than 1 Baht it currency call Satang.
	 * 
	 * @param value
	 */
	@Override
	public Valuable createMoney(double value) {
		if (value == 0.25 || value == 0.5) {
			Coin coin = new Coin(value);
			coin.setSpecialCurrency("Satang");
			return coin;
		}
		if (value == 1 || value == 2 || value == 5 || value == 10) {
			return new Coin(value);
		}
		if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000) {
			BankNote bank = new BankNote(value, nextSerialNumber);
			nextSerialNumber++;
			return bank;
		}
		throw new IllegalArgumentException();
	}
}
