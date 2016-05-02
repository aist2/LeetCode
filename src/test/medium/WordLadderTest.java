package medium;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class WordLadderTest {

	@Test
	public void testLadderLength() throws Exception {
		assertEquals(5, WordLadder.ladderLength("hit", "cog", new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"))));
	}
	
	@Test
	public void testLadderLength1() throws Exception {
		assertEquals(5, WordLadder.ladderLength("hit", "cog", new HashSet<String>(Arrays.asList("hot","dot","dig","lot","log"))));
	}
	
	@Test
	public void testLadderLength2() throws Exception {
		assertEquals(0, WordLadder.ladderLength("hit", "cog", new HashSet<String>(Arrays.asList("hot","dot","dig","lot","lob"))));
	}

}
