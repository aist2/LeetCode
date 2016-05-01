package easy;

import java.util.HashSet;
import java.util.Set;


public class ValidSudoku {
	public static boolean isValidSudoku(char[][] board) {
        return isValidSudoku1(board);
    }
	
	public static boolean isValidSudoku1(char[][] board) {
        return checkRows(board) && checkCols(board) && checkSections(board);
    }
	
	private static boolean checkRows(char[][] board){
		char val;
		for (int i=0; i<9; i++){
			Set<Character> set = new HashSet<Character>();
			for (int j=0;j<9;j++){
				val = board[i][j];
				if (val!='.') {
					if (!set.add(val)) return false;
				}
			}
		}
		return true;
	}

	private static boolean checkCols(char[][] board){
		char val;
		for (int i=0; i<9; i++){
			Set<Character> set = new HashSet<Character>();
			for (int j=0;j<9;j++){
				val = board[j][i];
				if (val!='.') {
					if (!set.add(val)) return false;
				}
			}
		}
		return true;
	}
	
	private static boolean checkSections(char[][] board){
		char val;
		for (int i=0; i<9; i+=3){
			for (int j=0;j<9;j+=3){
				Set<Character> set = new HashSet<Character>();
				for (int k=i;k<i+3;k++){
					for (int l=j;l<j+3;l++){
						val = board[k][l];
						if (val!='.') {
							if (!set.add(val)) return false;
						}
					}
				}
			}
		}
		return true;
	}
}
