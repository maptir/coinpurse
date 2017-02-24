package coinpurse;

public class ThaiMoneyFactory extends MoneyFactory {

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
		if (value == 20 || value == 50 || value == 100 || value == 500
				|| value == 1000) {
			return new BankNote(value);
		}
		throw new IllegalArgumentException();
	}
}
