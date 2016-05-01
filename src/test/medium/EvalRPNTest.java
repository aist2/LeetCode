package medium;
import static org.junit.Assert.*;
import medium.EvalRPN;

import org.junit.Test;


public class EvalRPNTest {

	@Test
	public final void test() {
		assertEquals(9, EvalRPN.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
	}
	@Test
	public final void test1() {
		assertEquals(6, EvalRPN.evalRPN(new String[] {"4", "13", "5", "/", "+"}));
	}
}
