package medium;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class WordBreakTest {

	@Test
	public void testWordBreak() throws Exception {
		assertTrue(WordBreak.wordBreak("leetcode", new HashSet<String>(Arrays.asList("leet","code"))));
	}

	@Test
	public void testWordBreak1() throws Exception {
		assertFalse(WordBreak.wordBreak("leetcode", new HashSet<String>(Arrays.asList("leet1","code"))));
	}
}
