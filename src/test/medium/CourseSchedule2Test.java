package medium;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CourseSchedule2Test {

	@Test
	public void testFindOrder() throws Exception {
		CourseSchedule2 instance = new CourseSchedule2();
		assertArrayEquals(new int[] {0,1}, instance.findOrder(2, new int[][] {{1,0}}));
	}

	@Test
	public void testFindOrder1() throws Exception {
		CourseSchedule2 instance = new CourseSchedule2();
		assertArrayEquals(new int[] {0,2,1,3}, instance.findOrder(4, new int[][] {{1,0},{2,0},{3,1},{3,2}}));
	}
}
