package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.StrStr;


public class StrStrTest {

	@Test
	public final void testStrStr1() {
		assertEquals(3,StrStr.strStr("abcdefg", "def"));
	}

	@Test
	public final void testStrStr2() {
		assertEquals(-1,StrStr.strStr("", "def"));
	}
	
	@Test
	public final void testStrStr3() {
		assertEquals(0,StrStr.strStr("abc", ""));
	}
	
	@Test
	public final void testStrStr4() {
		assertEquals(-1,StrStr.strStr("abc", "d"));
	}
	
	@Test
	public final void testStrStr5() {
		assertEquals(4,StrStr.strStr("mississippi", "issip"));
	}
}
