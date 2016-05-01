package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.CountAndSay;


public class CountAndSayTest {

	@Test
	public final void testCountAndSay1() {
		assertEquals("1", CountAndSay.countAndSay(1));
	}
	
	@Test
	public final void testCountAndSay2() {
		assertEquals("11", CountAndSay.countAndSay(2));
	}

	@Test
	public final void testCountAndSay3() {
		assertEquals("21", CountAndSay.countAndSay(3));
	}
	
	@Test
	public final void testCountAndSay4() {
		assertEquals("1211", CountAndSay.countAndSay(4));
	}
	
	@Test
	public final void testCountAndSay5() {
		assertEquals("111221", CountAndSay.countAndSay(5));
	}
	
	@Test
	public final void testCountAndSay6() {
		assertEquals("312211", CountAndSay.countAndSay(6));
	}
	
}
