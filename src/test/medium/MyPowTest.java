package medium;
import static org.junit.Assert.*;
import medium.MyPow;

import org.junit.Test;


public class MyPowTest {

	@Test
	public final void test() {
		assertEquals(700.28148, MyPow.myPow(8.88023, 3), 0.0);
	}

}
