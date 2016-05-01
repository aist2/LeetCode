package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.Merge;


public class MergeTest {

	@Test
	public void testMerge1() {
		int[] nums1 = {1,3,5,7,0,0,0,0};
		int m = 4;
		int[] nums2 = {0,3,4,6};
		int n = 4;
		
		int[] base = {0,1,3,3,4,5,6,7};
		Merge.merge(nums1, m, nums2, n);
		
		assertArrayEquals(base, nums1);
	}

	@Test
	public void testMerge2() {
		int[] nums1 = {1};
		int m = 1;
		int[] nums2 = {};
		int n = 0;
		
		int[] base = {1};
		Merge.merge(nums1, m, nums2, n);
		
		assertArrayEquals(base, nums1);
	}
	
	@Test
	public void testMerge3() {
		int[] nums1 = {4,5,6,7,0,0,0,0};
		int m = 4;
		int[] nums2 = {0,1,2,3};
		int n = 4;
		
		int[] base = {0,1,2,3,4,5,6,7};
		Merge.merge(nums1, m, nums2, n);
		
		assertArrayEquals(base, nums1);
	}
}
