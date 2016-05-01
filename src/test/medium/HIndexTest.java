package medium;
import static org.junit.Assert.*;
import medium.HIndex;

import org.junit.Test;

public class HIndexTest {

	@Test
	public void test() {
		assertEquals(3, HIndex.hIndex(new int[] {3,0,6,1,5}));
	}

	@Test
	public void test2() {
		assertEquals(1, HIndex.hIndex(new int[] {100}));
	}
	
	@Test
	public void test3() {
		assertEquals(1, HIndex.hIndex(new int[] {1,1}));
	}
}