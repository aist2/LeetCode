package medium;
import static org.junit.Assert.*;
import medium.RangeBitwiseAnd;

import org.junit.Test;


public class RangeBitwiseAndTest {

	@Test
	public final void test() {
		assertEquals(4, RangeBitwiseAnd.rangeBitwiseAnd(5, 7));
	}
	
	@Test
	public final void test1() {
		assertEquals(0, RangeBitwiseAnd.rangeBitwiseAnd(1, 3));
	}
	@Test
	public final void test2() {
		assertEquals(3, RangeBitwiseAnd.rangeBitwiseAnd(3, 3));
	}
}
