package uber;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ericli on 11/5/17.
 */
public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> boxSet = new HashSet<>();
            for (int j=0; j<9; j++) {
                char rowPoint = board[i][j];
                char colPoint = board[j][i];
                int boxRow = (i/3) * 3 + j/3;
                int boxCol = (i%3) * 3 + j%3;
                char boxPoint = board[boxRow][boxCol];
                if (rowPoint != '.' && !rowSet.add(rowPoint)) {
                    return false;
                }
                if (colPoint != '.' && !colSet.add(colPoint)) {
                    return false;
                }
                if (boxPoint != '.' && !boxSet.add(boxPoint)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
