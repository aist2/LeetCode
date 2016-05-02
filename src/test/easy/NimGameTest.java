package easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class NimGameTest {

	@Test
	public void testCanWinNim() throws Exception {
		assertFalse(NimGame.canWinNim(4));
	}

	@Test
	public void testCanWinNim1() throws Exception {
		assertTrue(NimGame.canWinNim(5));
	}
}
