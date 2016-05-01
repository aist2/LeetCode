package medium;
import static org.junit.Assert.*;
import medium.MaxProfit2;

import org.junit.Test;


public class MaxProfit2Test {

	@Test
	public final void test() {
		int res = MaxProfit2.maxProfit(new int[] {1,2,3});
		assertEquals(2,res);
	}

}
