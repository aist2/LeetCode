package medium;
import static org.junit.Assert.*;
import medium.UniquePaths;

import org.junit.Test;


public class UniquePathsTest {

	@Test
	public final void testUniquePaths() {
		assertEquals(330, UniquePaths.uniquePaths(8, 5));
	}

}
