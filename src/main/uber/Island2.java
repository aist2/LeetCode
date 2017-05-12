package uber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericli on 9/5/17.
 */
public class Island2 {
    public static List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[][] matrix = new int[m][n];
        List<Integer> res = new ArrayList<>(positions.length);
        for (int[] position: positions) {
            matrix[position[0]][position[1]] = 1;
            if (isNewIsland(position, matrix)) {
                if (res.size() == 0) {
                    res.add(1);
                } else {
                    res.add(res.get(res.size() - 1) + 1);
                }
            } else {
                if (res.size() == 0) {
                    res.add(0);
                } else {
                    res.add(res.get(res.size() - 1));
                }
            }
        }
        return res;
    }

    private static boolean isNewIsland(int[] position, int[][] matrix) {
        int row = position[0];
        int col = position[1];
        // up
        if (row - 1 >= 0 && matrix[row-1][col] == 1) {
            return false;
        }
        // down
        if (row + 1 <= matrix.length-1 && matrix[row+1][col] == 1) {
            return false;
        }
        // left
        if (col - 1 >= 0 && matrix[row][col-1] == 1) {
            return false;
        }
        // right
        if (col + 1 <= matrix[0].length-1 && matrix[row][col+1] == 1) {
            return false;
        }
        return true;
    }
}
