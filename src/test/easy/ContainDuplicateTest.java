package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.ContainDuplicate;


public class ContainDuplicateTest {

	@Test
	public void testContainsDuplicate1() {
		int[] input = {0,1,2,3,4,5,6,7,8,9,9};
		boolean res = ContainDuplicate.containsDuplicateV2(input);
		assertTrue(res);
	}
	@Test
	public void testContainsDuplicate2() {
		int[] input = {0,1,2,3,4,5,6,7,8,9};
		boolean res = ContainDuplicate.containsDuplicateV2(input);
		assertFalse(res);
	}
}
