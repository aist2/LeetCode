package medium;
import static org.junit.Assert.*;
import medium.BulbSwitch;

import org.junit.Test;


public class BulbSwitchTest {

	@Test
	public final void test() {
		assertEquals(1,BulbSwitch.bulbSwitch(3));
	}

}
