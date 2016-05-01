package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.RemoveElement;


public class RemoveElementTest {

	@Test
	public void testRemoveElement1() {
		int[] nums = {1,2,3,1,2,3,1};
		int val = 1;
		int base = 4;
		
		int res = RemoveElement.removeElement(nums, val);
		
		assertEquals(res, base);
	}

	@Test
	public void testRemoveElement2() {
		int[] nums = {1};
		int val = 1;
		int base = 0;
		
		int res = RemoveElement.removeElement(nums, val);
		
		assertEquals(res, base);
	}
	
	@Test
	public void testRemoveElement3() {
		int[] nums = {1,1};
		int val = 1;
		int base = 0;
		
		int res = RemoveElement.removeElement(nums, val);
		
		assertEquals(res, base);
	}
}
