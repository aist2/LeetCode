package medium;
import static org.junit.Assert.*;
import medium.SearchInsert;

import org.junit.Test;


public class SearchInsertTest {

	@Test
	public final void testSearchInsert1() {
		assertEquals(2, SearchInsert.searchInsert(new int[]{1,3,5,6}, 5));
	}
	
	@Test
	public final void testSearchInsert2() {
		assertEquals(1, SearchInsert.searchInsert(new int[]{1,3,5,6}, 2));
	}

	@Test
	public final void testSearchInsert3() {
		assertEquals(4, SearchInsert.searchInsert(new int[]{1,3,5,6}, 7));
	}
	
	@Test
	public final void testSearchInsert4() {
		assertEquals(0, SearchInsert.searchInsert(new int[]{1,3,5,6}, 0));
	}
}
