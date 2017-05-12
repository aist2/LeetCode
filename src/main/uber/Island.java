package uber;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ericli on 9/5/17.
 */
public class Island {
    public static int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int row=0; row<grid.length; row++) {
            for (int col=0; col<grid[0].length; col++) {
                if (!visited[row][col] && grid[row][col] == '1') {
                    count++;
                }
                newIslandBFS(grid, visited, row, col);
            }
        }
        return count;
    }

    private static void newIslandDFS(char[][] grid, boolean[][] visited, int row, int col) {
        if (row>=grid.length || row<0 || col>=grid[0].length || col<0) {
            return;
        }
        if (visited[row][col]) {
            return;
        }
        visited[row][col] = true;
        if (grid[row][col] == '1') {
            newIslandDFS(grid, visited, row-1, col);
            newIslandDFS(grid, visited, row+1, col);
            newIslandDFS(grid, visited, row, col-1);
            newIslandDFS(grid, visited, row, col+1);

        }
    }

    private static void newIslandBFS(char[][] grid, boolean[][] visited, int row, int col) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {row, col});
        while (!q.isEmpty()) {
            int[] position = q.poll();
            int x = position[0];
            int y = position[1];
            if (x>=grid.length || x<0 || y>=grid[0].length || y<0 || visited[x][y]) {
                continue;
            }
            visited[x][y] = true;
            if (grid[x][y] == '1') {
                q.offer(new int[] {x-1,y});
                q.offer(new int[] {x+1,y});
                q.offer(new int[] {x,y-1});
                q.offer(new int[] {x,y+1});
            }
        }
    }

    public int numIslandsUF(char[][] grid) {
        UF uf = new UF(grid);
        int rows = grid.length;
        int cols = grid[0].length;
        for (int x=0; x<rows; x++) {
            for (int y=0; y<cols; y++) {
                int p = x * cols + y;
                if (grid[x][y] == '1') {
                    if (x+1<rows && grid[x+1][y] == '1') {
                        int q = (x+1) * cols + y;
                        uf.union(p, q);
                    }
                    if (y+1<cols && grid[x][y+1] == '1') {
                        int q = x * cols + y + 1;
                        uf.union(p, q);
                    }
                }
            }
        }
        return uf.count;
    }

    public class UF {
        int count;
        int[] arr;
        public UF(char[][] grid) {
            count = 0;
            int rows = grid.length;
            int cols = grid[0].length;
            arr = new int[rows*cols];

            for (int i=0; i<rows; i++) {
                for (int j=0; j<cols; j++) {
                    int pos = i * cols + j;
                    arr[pos] = pos;
                    if (grid[i][j] == '1') {
                        count++;
                    }
                }
            }
        }

        public void union(int p, int q) {
            int pID = find(p);
            int qID = find(q);
            if (pID != qID) {
                arr[pID] = qID;
                count--;
            }
        }

        public int find(int p) {
            while (p != arr[p]) {
                arr[p] = arr[arr[p]];
                p = arr[p];
            }
            return p;
        }
    }
}
