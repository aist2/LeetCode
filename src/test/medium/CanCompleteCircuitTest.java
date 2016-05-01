package medium;
import static org.junit.Assert.*;
import medium.CanCompleteCircuit;

import org.junit.Test;


public class CanCompleteCircuitTest {

	@Test
	public final void test() {
		assertEquals(0, CanCompleteCircuit.canCompleteCircuit(new int[] {10,5,6,3,1}, new int[] {4,10,3,2,6}));
	}
	@Test
	public final void test1() {
		assertEquals(3, CanCompleteCircuit.canCompleteCircuit(new int[] {1,2,3,3}, new int[] {2,1,5,1}));
	}
}
