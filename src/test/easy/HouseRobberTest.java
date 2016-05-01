package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.HouseRobber;


public class HouseRobberTest {

	@Test
	public final void testRob() {
		HouseRobber obj = new HouseRobber();
		int[] nums = {1,9,1,1,5,1,10,8};
		assertEquals(24,obj.rob(nums));
	}

}
