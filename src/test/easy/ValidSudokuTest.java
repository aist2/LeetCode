package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.ValidSudoku;


public class ValidSudokuTest {

	@Test
	public void testIsValidSudoku1() {
		char[][] board = 
			{{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}};
		boolean res = ValidSudoku.isValidSudoku(board);
		assertTrue(res);
	}

	@Test
	public void testIsValidSudoku2() {
		char[][] board = 
			{{'6','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}};
		boolean res = ValidSudoku.isValidSudoku(board);
		assertFalse(res);
	}
	
	@Test
	public void testIsValidSudoku3() {
		char[][] board = 
			{{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'}};
		boolean res = ValidSudoku.isValidSudoku(board);
		assertTrue(res);
	}
	
	@Test
	public void testIsValidSudoku4() {
		char[][] board = 
			{{'5','3','.','.','7','.','.','.','7'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}};
		boolean res = ValidSudoku.isValidSudoku(board);
		assertFalse(res);
	}
	
	@Test
	public void testIsValidSudoku5() {
		char[][] board = 
			{{'5','3','.','.','7','.','.','.','.'},
			{'6','.','3','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}};
		boolean res = ValidSudoku.isValidSudoku(board);
		assertFalse(res);
	}
}
