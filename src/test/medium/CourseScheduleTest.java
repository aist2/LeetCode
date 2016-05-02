package medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseScheduleTest {

	@Test
	public void testCanFinish() throws Exception {
		assertTrue(CourseSchedule.canFinish(2, new int[][] {{1,0}}));
	}

	@Test
	public void testCanFinish1() throws Exception {
		assertFalse(CourseSchedule.canFinish(2, new int[][] {{1,0},{0,1}}));
	}
}
