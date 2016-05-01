package medium;
import static org.junit.Assert.*;
import medium.PermutationSequence;

import org.junit.Test;


public class PermutationSequenceTest {

	@Test
	public final void test() {
		assertEquals("312",PermutationSequence.getPermutation(3,5));
	}

	@Test
	public final void test1() {
		assertEquals("123",PermutationSequence.getPermutation(3,1));
	}
	
}
