package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.CompareVersion;


public class CompareVersionTest {

	@Test
	public final void testCompareVersion1() {
		assertEquals(-1, CompareVersion.compareVersion("1.1", "1.2"));
	}
	
	@Test
	public final void testCompareVersion2() {
		assertEquals(1, CompareVersion.compareVersion("13.25", "1.2"));
	}
	
	@Test
	public final void testCompareVersion3() {
		assertEquals(1, CompareVersion.compareVersion("1.0.1", "1"));
	}
	
	@Test
	public final void testCompareVersion4() {
		assertEquals(0, CompareVersion.compareVersion("1.2", "1.2"));
	}

}
