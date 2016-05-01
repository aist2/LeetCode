package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.MoveZeros;


public class MoveZerosTest extends MoveZeros {

	@Test
	public void testMoveZeroes1() {
		int[] input = {1,3,12};
		int[] base = {1,3,12};
		moveZerosV2(input);
		assertArrayEquals(base, input);
	}

	@Test
	public void testMoveZeroes2() {
		int[] input = {0,1,0,3,12};
		int[] base = {1,3,12,0,0};
		moveZerosV2(input);
		assertArrayEquals(base, input);
	}
	
	@Test
	public void testMoveZeroes3() {
		int[] input = {0,0,0,1,3,12};
		int[] base = {1,3,12,0,0,0};
		moveZerosV2(input);
		assertArrayEquals(base, input);
	}
}
