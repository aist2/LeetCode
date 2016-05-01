package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.CommonPrefix;


public class CommonPrefixTest {

	@Test
	public final void testLongestCommonPrefix1() {
		String[] strs = {"abcdefg","abc","abc123"};
		assertEquals("abc", CommonPrefix.longestCommonPrefix(strs));
	}
	
	@Test
	public final void testLongestCommonPrefix2() {
		String[] strs = {"abcdefg","bca;sdlfj l;askjfasd;lkfjasdl;fkj","abc123"};
		assertEquals("", CommonPrefix.longestCommonPrefix(strs));
	}
	
	@Test
	public final void testLongestCommonPrefix3() {
		String[] strs = {"abc","abdf","abcdefg"};
		assertEquals("ab", CommonPrefix.longestCommonPrefix(strs));
	}

}
