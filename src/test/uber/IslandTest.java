package uber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ericli on 10/5/17.
 */
public class IslandTest {
    @Test
    public void test1() throws Exception {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'},
        };
        int res = Island.numIslands(grid);
        assertEquals(1, res);
    }

    @Test
    public void test2() throws Exception {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'},
        };
        int res = Island.numIslands(grid);
        assertEquals(3, res);
    }

    @Test
    public void testUF() throws Exception {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };
        Island island = new Island();
        int res = island.numIslandsUF(grid);
        assertEquals(3, res);
    }
}