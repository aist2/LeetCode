package medium;
import static org.junit.Assert.*;
import medium.MaxProfit;

import org.junit.Test;


public class MaxProfitTest {

	@Test
	public final void test() {
		int res = MaxProfit.maxProfit(new int[] {1,2,3});
		assertEquals(2,res);
	}
	
	@Test
	public final void test2() {
		int res = MaxProfit.maxProfit(new int[] {1,4,3,2});
		assertEquals(3,res);
	}
	
	@Test
	public final void test3() {
		int res = MaxProfit.maxProfit(new int[] {4,3,2,1});
		assertEquals(0,res);
	}

	@Test
	public final void test4() {
		int res = MaxProfit.maxProfit(new int[] {1,2,3,4});
		assertEquals(3,res);
	}
}
