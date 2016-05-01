package medium;
import static org.junit.Assert.*;
import medium.MaxProduct;

import org.junit.Test;


public class MaxProductTest {

	@Test
	public final void test() {
		assertEquals(6,MaxProduct.maxProduct(new int[] {2,3,-2,4}));
	}

}
