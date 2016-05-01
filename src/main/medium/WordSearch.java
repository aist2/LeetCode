package medium;
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
    	int rows = board.length;
    	int cols = board[0].length;
    	boolean[][] traceBoard = new boolean[rows][cols];
    	for (int i=0; i<rows; i++){
    		for (int j=0; j<cols; j++) {
				if (search(board, word, 0, i, j, traceBoard)) return true;
    		}
    	}
        return false;
    }
    
    private static boolean search(char[][] board, String word, int wordIdx, int i, int j, boolean[][] traceBoard) {
    	if (wordIdx == word.length()) return true;
    	if (i<0 || i>= board.length || j<0 || j>= board[0].length) return false;
    	if (traceBoard[i][j]) return false;
    	if (board[i][j]!=word.charAt(wordIdx)) return false;
    	traceBoard[i][j] = true;
    	wordIdx++;
		boolean res = search(board,word,wordIdx,i-1,j,traceBoard)||
				search(board,word,wordIdx,i,j-1,traceBoard)||
				search(board,word,wordIdx,i+1,j,traceBoard)||
				search(board,word,wordIdx,i,j+1,traceBoard);
		traceBoard[i][j] = false;
		return res;
    }
}
