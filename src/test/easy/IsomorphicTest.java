package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.Isomorphic;


public class IsomorphicTest {

	@Test
	public void testIsIsomorphic1() {
		String s = "egg";
		String t = "add";
		assertTrue(Isomorphic.isIsomorphic(s, t));
	}
	@Test
	public void testIsIsomorphic2() {
		String s = "foo";
		String t = "bar";
		assertFalse(Isomorphic.isIsomorphic(s, t));
	}
	
	@Test
	public void testIsIsomorphic3() {
		String s = "aabb";
		String t = "cccc";
		assertFalse(Isomorphic.isIsomorphic(s, t));
	}
	
	@Test
	public void testIsIsomorphic4() {
		String s = "paper";
		String t = "title";
		assertTrue(Isomorphic.isIsomorphic(s, t));
	}

	@Test
	public void testIsIsomorphic5() {
		String s = "cccc";
		String t = "aabb";
		assertFalse(Isomorphic.isIsomorphic(s, t));
	}
}
