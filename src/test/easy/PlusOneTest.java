package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.PlusOne;


public class PlusOneTest {

	@Test
	public void testPlusOne1() {
		int[] digits = {1};
		int[] base = {2};
		int[] res = PlusOne.plusOne(digits);
		assertArrayEquals(base,res);
	}

	@Test
	public void testPlusOne2() {
		int[] digits = {1,9,9,9,9};
		int[] base = {2,0,0,0,0};
		int[] res = PlusOne.plusOne(digits);
		assertArrayEquals(base,res);
	}
	
	@Test
	public void testPlusOne3() {
		int[] digits = {9,9,9,9,9};
		int[] base = {1,0,0,0,0,0};
		int[] res = PlusOne.plusOne(digits);
		assertArrayEquals(base,res);
	}
}
