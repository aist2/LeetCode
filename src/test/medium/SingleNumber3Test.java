package medium;
import static org.junit.Assert.*;
import medium.SingleNumber3;

import org.junit.Test;


public class SingleNumber3Test {

	@Test
	public final void test() {
		assertArrayEquals(new int[]{5,3}, SingleNumber3.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
	}

}
