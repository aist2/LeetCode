package medium;
import static org.junit.Assert.*;
import medium.ReverseWords;

import org.junit.Test;


public class ReverseWordsTest {

	@Test
	public final void test() {
		assertEquals("blue is sky the", ReverseWords.reverseWords(" the sky is    blue "));
	}

}
