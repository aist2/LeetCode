package medium;
import static org.junit.Assert.*;
import medium.MaxSquare;

import org.junit.Test;


public class MaxSquareTest {

	@Test
	public final void test() {
		assertEquals(4, MaxSquare.maximalSquare(new char[][] {{'1','0','1','0','0'},
															{'1','0','1','1','1'},
															{'1','1','1','1','1'},
															{'1','0','0','1','0'}}));
	}

}
