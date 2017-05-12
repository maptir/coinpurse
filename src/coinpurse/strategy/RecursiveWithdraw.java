package coinpurse.strategy;

import java.util.ArrayList;
import java.util.List;

import coinpurse.Valuable;

public class RecursiveWithdraw implements WithdrawStrategy {

	@Override
	public List<Valuable> withdraw(double amount, List<Valuable> money) {
		List<Valuable> result = new ArrayList<Valuable>();
		if (amount == 0 && money.isEmpty())
			return result;
		if (money.isEmpty())
			return null;
		Valuable first = money.get(0);
		if ((result = withdraw(amount - first.getValue(),
				money.subList(1, money.size()))) != null) {
			result.add(first);
			return result;
		}
		if ((result = withdraw(amount, money.subList(1, money.size()))) != null) {
			return result;
		}
		return null;
	}
}
