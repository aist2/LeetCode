package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.LengthOfLastWord;


public class LengthOfLastWordTest {

	@Test
	public final void testLengthOfLastWord1() {
		assertEquals(5, LengthOfLastWord.lengthOfLastWord("Hello World"));
	}

	@Test
	public final void testLengthOfLastWord2() {
		assertEquals(3, LengthOfLastWord.lengthOfLastWord("ABC "));
	}
	
	@Test
	public final void testLengthOfLastWord3() {
		assertEquals(0, LengthOfLastWord.lengthOfLastWord(""));
	}
	
	@Test
	public final void testLengthOfLastWord4() {
		assertEquals(0, LengthOfLastWord.lengthOfLastWord("123 .."));
	}
}
