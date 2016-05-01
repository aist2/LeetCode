package medium;
import static org.junit.Assert.*;
import medium.Multiply;

import org.junit.Test;


public class MultiplyTest {

	@Test
	public final void test() {
		assertEquals("121",Multiply.multiply("11", "11"));
	}

	@Test
	public final void test2() {
		assertEquals("121932631112635269",Multiply.multiply("123456789", "987654321"));
	}

	@Test
	public final void test3() {
		assertEquals("0",Multiply.multiply("0", "0"));
	}
}

