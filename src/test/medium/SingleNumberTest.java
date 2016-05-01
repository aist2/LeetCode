package medium;
import static org.junit.Assert.*;
import medium.SingleNumber;

import org.junit.Test;


public class SingleNumberTest {

	@Test
	public final void test() {
		assertEquals(1,SingleNumber.singleNumber(new int[]{1,2,3,3,2}));
	}
	
	@Test
	public final void test2() {
		assertEquals(5,SingleNumber.singleNumber(new int[]{5,2,3,3,2}));
	}
	@Test
	public final void test3() {
		assertEquals(5,SingleNumber.singleNumber(new int[]{2,5,3,3,2}));
	}
}
