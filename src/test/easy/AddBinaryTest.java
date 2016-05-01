package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.AddBinary;

public class AddBinaryTest {

	@Test
	public final void testAddBinary1() {
		String a = "11";
		String b = "1";
		String res = AddBinary.addBinary(a, b);
		assertEquals("100",res);
	}

	@Test
	public final void testAddBinary2() {
		String a = "1110110101";
		String b = "1110111011";
		String res = AddBinary.addBinary(a, b);
		assertEquals("11101110000",res);
	}
}
