package medium;
import static org.junit.Assert.*;
import medium.RemoveDuplicates;

import org.junit.Test;


public class RemoveDuplicatesTest {

	@Test
	public final void testRemoveDuplicates() {
		assertEquals(5,RemoveDuplicates.removeDuplicates(new int[] {1,1,1,2,2,3}));
	}

}
