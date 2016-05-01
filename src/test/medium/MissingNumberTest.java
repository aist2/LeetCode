package medium;
import static org.junit.Assert.*;
import medium.MissingNumber;

import org.junit.Test;


public class MissingNumberTest {

	@Test
	public final void test() {
		assertEquals(2, MissingNumber.missingNumber(new int[] {0,1,3}));
	}

}
