package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.TitleToNumber;


public class TitleToNumberTest {

	@Test
	public final void testTitleToNumber1() {
		assertEquals(1,TitleToNumber.titleToNumber("A"));
	}
	
	@Test
	public final void testTitleToNumber2() {
		assertEquals(0,TitleToNumber.titleToNumber(""));
	}
	
	@Test
	public final void testTitleToNumber3() {
		assertEquals(28,TitleToNumber.titleToNumber("AB"));
	}
	
	@Test
	public final void testTitleToNumber4() {
		assertEquals(26,TitleToNumber.titleToNumber("Z"));
	}


}
