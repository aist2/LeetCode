package medium;
import static org.junit.Assert.*;
import medium.JumpGame;

import org.junit.Test;


public class JumpGameTest {

	@Test
	public final void testCanJump1() {
		int[] nums = {2,3,1,1,4};
		assertTrue(JumpGame.canJump(nums));
	}

	@Test
	public final void testCanJump2() {
		int[] nums = {3,2,1,0,4};
		assertFalse(JumpGame.canJump(nums));
	}
	

	@Test
	public final void testCanJump3() {
		int[] nums = {3,7,1,0,4};
		assertTrue(JumpGame.canJump(nums));
	}
	
	@Test
	public final void testCanJump4() {
		int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		assertTrue(JumpGame.canJump(nums));
	}
}
