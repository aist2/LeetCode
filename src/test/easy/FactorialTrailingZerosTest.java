package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.FactorialTrailingZeros;


public class FactorialTrailingZerosTest {

	@Test
	public final void testTrailingZeroes1() {
		assertEquals(0, FactorialTrailingZeros.trailingZeroes(2));
	}

	@Test
	public final void testTrailingZeroes2() {
		assertEquals(1, FactorialTrailingZeros.trailingZeroes(5));
	}
	
	@Test
	public final void testTrailingZeroes3() {
		assertEquals(7, FactorialTrailingZeros.trailingZeroes(30));
	}
	
	@Test
	public final void testTrailingZeroes4() {
		assertEquals(2, FactorialTrailingZeros.trailingZeroes(10));
	}
	
}
