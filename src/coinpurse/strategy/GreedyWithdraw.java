package coinpurse.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import coinpurse.Valuable;

public class GreedyWithdraw implements WithdrawStrategy {

	@Override
	public List<Valuable> withdraw(double amount, List<Valuable> money) {
		Collections.sort(money, new Comparator<Valuable>() {
			@Override
			public int compare(Valuable o1, Valuable o2) {
				return Double.compare(o2.getValue(), o1.getValue());
			}
		});
		ArrayList<Valuable> templist = new ArrayList<>();
		for (Valuable value : money) {
			if (amount >= value.getValue()) {
				amount -= value.getValue();
				templist.add(value);
			}
		}
		if (amount > 0)
			return null;
		// Valuable[] withdraw = new Valuable[templist.size()];
		// return templist.toArray(withdraw);
		return templist;
	}

}
