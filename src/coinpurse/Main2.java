package coinpurse;

public class Main2 {
	public static void main(String[] args) {
		MoneyFactory factory = MoneyFactory.getInstance();
		Valuable m1 = factory.createMoney(5);
		System.out.println(m1);
		Valuable m2 = factory.createMoney("0.5");
		System.out.println(m2);
	}
}
