package coinpurse;

/**
 * Create money in coin and banknote in Malaysia currency
 * 
 * @author Archawin Tirugsapun
 *
 */
public class MalayMoneyFactory extends MoneyFactory {

	/**
	 * Create money if it possible by its value and it have two type coin and
	 * banknote if value is less than 1 Ringgit it currency call Sen.
	 * 
	 * @param value
	 */
	@Override
	public Valuable createMoney(double value) {
		if (value == 0.05 || value == 0.1 || value == 0.2 || value == 0.5) {
			Coin coin = new Coin(value, "Ringgit");
			coin.setSpecialCurrency("Sen");
			return coin;
		}
		if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value == 50 || value == 100) {
			BankNote bank = new BankNote(value, "Ringgit", nextSerialNumber);
			nextSerialNumber++;
			return bank;
		}
		throw new IllegalArgumentException();
	}
}