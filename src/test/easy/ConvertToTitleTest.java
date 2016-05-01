package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ConvertToTitle;


public class ConvertToTitleTest {

	@Test
	public final void testConvertToTitle1() {
		assertEquals("A",ConvertToTitle.convertToTitle(1));
	}
	
	@Test
	public final void testConvertToTitle2() {
		assertEquals("",ConvertToTitle.convertToTitle(0));
	}
	
	@Test
	public final void testConvertToTitle3() {
		assertEquals("AB",ConvertToTitle.convertToTitle(28));
	}
	
	@Test
	public final void testConvertToTitle4() {
		assertEquals("Z",ConvertToTitle.convertToTitle(26));
	}

}
