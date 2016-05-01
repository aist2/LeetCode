package medium;

public class SurrondedRegion {
    public static void solve(char[][] board) {
    	if (board==null || board.length==0 || board[0].length==0) return;
        boolean[][] tempBoard = new boolean[board.length][board[0].length];
        for (int i=0; i<board.length; i+=board.length-1) {
        	for (int j=0; j<board[0].length; j++) {
        		if (board[i][j] == 'O')
        			helper(board, tempBoard, i, j);
        	}
        	if(board.length==1)
        		break;
        }
        for (int j=0; j<board[0].length; j+=board[0].length-1) {
        	for (int i=0; i<board.length; i++) {
        		if (board[i][j] == 'O')
        			helper(board, tempBoard, i, j);
        	}
        	if (board[0].length == 1)
        		break;
        }
        for (int i=0; i<board.length; i++) {
        	for (int j=0; j<board[0].length; j++) {
        		if (!tempBoard[i][j] && board[i][j]=='O')
        			board[i][j] = 'X';
        	}
        }
    }
    
    private static void helper(char[][] board, boolean[][] tempBoard, int i, int j) {
    	if (i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!='O' || tempBoard[i][j])
    		return;
    	tempBoard[i][j] = true;
    	if (i-1>0)
    		helper(board, tempBoard, i-1, j);
    	if (i+1<board.length-1)
    		helper(board, tempBoard, i+1, j);
    	if (j-1>0)
    		helper(board, tempBoard, i, j-1);
    	if (j+1<board[0].length-1)
    		helper(board, tempBoard, i, j+1);
    }
}
