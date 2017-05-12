package uber;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ericli on 11/5/17.
 */
public class ValidSudokuTest {
    @Test
    public void isValidSudoku() throws Exception {
        char[][] board = {
                {'.', '8', '7', '6', '5', '4', '3', '2', '1'},
                {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        assertTrue(ValidSudoku.isValidSudoku(board));
    }

}