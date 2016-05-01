package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.HammingWeight;


public class HammingWeightTest {

	@Test
	public final void testHammingWeight() {
		assertEquals(3, HammingWeight.hammingWeight(11));
	}

}
