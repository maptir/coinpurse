package coinpurse;

public class MalayMoneyFactory extends MoneyFactory {

	@Override
	public Valuable createMoney(double value) {
		if (value == 0.05 || value == 0.1 || value == 0.2 || value == 0.5) {
			Coin coin =  new Coin(value, "Ringgit");
			coin.setSpecialCurrency("Sen");
			return coin;
		}
		if (value == 1 || value == 2 || value == 5 || value == 10
				|| value == 20 || value == 50 || value == 100) {
			return new BankNote(value, "Ringgit");
		}
		throw new IllegalArgumentException();
	}
}
