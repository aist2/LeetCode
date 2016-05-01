package medium;
import static org.junit.Assert.*;
import medium.IntToRoman;

import org.junit.Test;

public class IntToRomanTest {

	@Test
	public void test() {
		assertEquals("MMMCMXCIX",IntToRoman.intToRoman(3999));
	}

}
