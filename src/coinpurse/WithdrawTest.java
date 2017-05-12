package coinpurse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import coinpurse.strategy.GreedyWithdraw;
import coinpurse.strategy.RecursiveWithdraw;

public class WithdrawTest {
	private Purse purse;

	@Before
	public void setUp() {
		purse = new Purse(3);
//		purse.setStrategy(new GreedyWithdraw());
		purse.setStrategy(new RecursiveWithdraw());
	}

	@Test
	public void testWIthdrawEmptyPurse() {
		assertNull(purse.withdraw(10));
	}

	@Test
	public void testSimpleWithdraw() {
		Coin coin = new Coin(10);
		purse.insert(coin);
		purse.insert(coin);
		Valuable[] expected = { coin, coin };
		Valuable[] result = purse.withdraw(20);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testNonGreedy() {
		Coin coin1 = new Coin(5);
		Coin coin2 = new Coin(2);
		purse.insert(coin1);
		purse.insert(coin2);
		purse.insert(coin2);
		purse.insert(coin2);
		Valuable[] expected = { coin1, coin2, coin2, coin2 };
		Valuable[] result = purse.withdraw(6);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testMultiWithdraw() {
		Coin coin1 = new Coin(5);
		Coin coin2 = new Coin(2);
		purse.insert(coin1);
		purse.insert(coin2);
		purse.insert(coin2);
		purse.insert(coin2);
		purse.withdraw(2);
		purse.withdraw(2);
		purse.withdraw(2);
		Valuable[] expected = { coin1 };
		Valuable[] result = purse.withdraw(5);
		assertArrayEquals(expected, result);
	}
}
