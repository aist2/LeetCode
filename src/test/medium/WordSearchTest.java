package medium;
import static org.junit.Assert.*;
import medium.WordSearch;

import org.junit.Test;


public class WordSearchTest {

	@Test
	public final void test1() {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		assertTrue(WordSearch.exist(board, "ABCCED"));
	}

	@Test
	public final void test2() {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		assertTrue(WordSearch.exist(board, "SEE"));
	}
	
	@Test
	public final void test3() {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		assertFalse(WordSearch.exist(board, "ABCB"));
	}
	
	@Test
	public final void test4() {
		char[][] board = {{'A','A','A','A'},{'A','A','A','A'},{'A','A','A','A'}};
		assertFalse(WordSearch.exist(board, "AAAAAAAAAAAAAA"));
	}
	
	@Test
	public final void test5() {
		char[][] board = {{'A','A'}};
		assertFalse(WordSearch.exist(board, "AAA"));
	}
}
