package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ValidParentheses;


public class ValidParenthesesTest {

	@Test
	public final void testIsValid1() {
		assertTrue(ValidParentheses.isValid("{abc(def[ghi(lsd)])}"));
	}
	
	@Test
	public final void testIsValid2() {
		assertFalse(ValidParentheses.isValid("{abc(def[ghi(lsd])}"));
	}
	
	@Test
	public final void testIsValid3() {
		assertFalse(ValidParentheses.isValid("]"));
	}

}
