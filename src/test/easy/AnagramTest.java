package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.Anagram;


public class AnagramTest {

	@Test
	public void testIsAnagram1() {
		String s = "anagram";
		String t = "nagaram";
		boolean res = Anagram.isAnagram(s, t);
		assertTrue(res);
	}

	@Test
	public void testIsAnagram2() {
		String s = "rat";
		String t = "car";
		boolean res = Anagram.isAnagram(s, t);
		assertFalse(res);
	}
	
	@Test
	public void testIsAnagram3() {
		String s = "ab";
		String t = "a";
		boolean res = Anagram.isAnagram(s, t);
		assertFalse(res);
	}
}
