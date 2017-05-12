package uber;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ericli on 8/5/17.
 */
public class CourseScheduleTest {
    @Test
    public void findOrderDFS() throws Exception {
        int[][] input = {{1,0},{2,0},{3,1},{3,2}};
        CourseSchedule schedule = new CourseSchedule();
        int[] res = schedule.findOrderDFS(4, input);
        int[] expected = {0,2,1,3};
        assertArrayEquals(expected, res);
    }

    @Test
    public void findOrderDFS2() throws Exception {
        int[][] input = {{1,0},{2,0},{3,1},{3,2},{1,3}};
        CourseSchedule schedule = new CourseSchedule();
        int[] res = schedule.findOrderDFS(4, input);
        int[] expected = {1,3};
        assertArrayEquals(expected, res);
    }

    @Test
    public void findOrderBFS() {
        int[][] input = {{1,0},{2,0},{3,1},{3,2}};
        CourseSchedule schedule = new CourseSchedule();
        int [] res = schedule.findOrderBFS(4, input);
        int[] expected = {0,1,2,3};
        assertArrayEquals(expected, res);
    }

    @Test
    public void findOrderBFS2() {
        int[][] input = {{1,0},{2,0},{3,1},{3,2},{1,3}};
        CourseSchedule schedule = new CourseSchedule();
        int [] res = schedule.findOrderBFS(4, input);
        assertNull(res);
    }

}