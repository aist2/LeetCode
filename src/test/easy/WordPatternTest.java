package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.WordPattern;


public class WordPatternTest {

	@Test
	public void testWordPattern1() {
		String pattern = "abba";
		String str = "cat dog dog cat";
		boolean res = WordPattern.wordPattern(pattern, str);
		assertTrue(res);
	}

	@Test
	public void testWordPattern2() {
		String pattern = "abba";
		String str = "cat dog dog dog";
		boolean res = WordPattern.wordPattern(pattern, str);
		assertFalse(res);
	}
	@Test
	public void testWordPattern3() {
		String pattern = "";
		String str = "cat dog dog dog";
		boolean res = WordPattern.wordPattern(pattern, str);
		assertFalse(res);
	}
	
	@Test
	public void testWordPattern4() {
		String pattern = "abba";
		String str = "dog dog dog dog";
		boolean res = WordPattern.wordPattern(pattern, str);
		assertFalse(res);
	}
	
	@Test
	public void testWordPattern5() {
		String pattern = "ab";
		String str = "dog dog";
		boolean res = WordPattern.wordPattern(pattern, str);
		assertFalse(res);
	}
	
	@Test
	public void testWordPattern6() {
		String pattern = "aa";
		String str = "dog cat";
		boolean res = WordPattern.wordPattern(pattern, str);
		assertFalse(res);
	}
}
