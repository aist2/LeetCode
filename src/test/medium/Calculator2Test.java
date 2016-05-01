package medium;
import static org.junit.Assert.*;
import medium.Calculator2;

import org.junit.Test;


public class Calculator2Test {

	@Test
	public final void test() {
		assertEquals(7,Calculator2.calculate("3+2*2"));
	}
	@Test
	public final void test1() {
		assertEquals(1,Calculator2.calculate(" 3/2 "));
	}
	@Test
	public final void test2() {
		assertEquals(5,Calculator2.calculate(" 3+5 / 2 "));
	}
}
