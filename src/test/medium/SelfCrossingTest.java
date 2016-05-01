package medium;
import static org.junit.Assert.*;
import medium.SelfCrossing;

import org.junit.Test;


public class SelfCrossingTest {

	@Test
	public final void test() {
		assertFalse(SelfCrossing.isSelfCrossing(new int[] {1,2,3,4}));
	}
	@Test
	public final void test1() {
		assertTrue(SelfCrossing.isSelfCrossing(new int[] {2,1,1,2}));
	}

}
