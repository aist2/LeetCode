package medium;
import static org.junit.Assert.*;
import medium.SimplifyPath;

import org.junit.Test;


public class SimplifyPathTest {

	@Test
	public final void test() {
		assertEquals("/home",SimplifyPath.simplifyPath("/home/"));
	}

	@Test
	public final void test1() {
		assertEquals("/c",SimplifyPath.simplifyPath("/a/./b/../../c/"));
	}
	
	@Test
	public final void test2() {
		assertEquals("/home/foo",SimplifyPath.simplifyPath("/home//foo/"));
	}
	
	@Test
	public final void test4() {
		assertEquals("/",SimplifyPath.simplifyPath("/../"));
	}
	
	@Test
	public final void test5() {
		assertEquals("/...",SimplifyPath.simplifyPath("/.../"));
	}
}
