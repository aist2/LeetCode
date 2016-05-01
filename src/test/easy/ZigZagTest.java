package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ZigZag;


public class ZigZagTest {

	@Test
	public final void testConvert() {
		assertEquals("PAHNAPLSIIGYIR", ZigZag.convert("PAYPALISHIRING", 3));
	}

}
