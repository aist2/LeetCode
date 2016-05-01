package easy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;



import org.junit.Test;

import easy.SummaryRanges;
import static org.hamcrest.CoreMatchers.*;

public class SummaryRangesTest {

	@Test
	public void testSummaryRanges1() {
		int[] nums = {0,1,2,4,5,7};
		List<String> base = Arrays.asList("0->2","4->5","7");
		List<String> res = SummaryRanges.summaryRanges(nums);
		assertThat(res, is(base));
	}
	@Test
	public void testSummaryRanges2() {
		int[] nums = {0,1,2,5,6,7};
		List<String> base = Arrays.asList("0->2","5->7");
		List<String> res = SummaryRanges.summaryRanges(nums);
		assertThat(res, is(base));
	}
	
	@Test
	public void testSummaryRanges3() {
		int[] nums = {};
		List<String> base = Arrays.asList();
		List<String> res = SummaryRanges.summaryRanges(nums);
		assertThat(res, is(base));
	}
	
	@Test
	public void testSummaryRanges4() {
		int[] nums = {1};
		List<String> base = Arrays.asList("1");
		List<String> res = SummaryRanges.summaryRanges(nums);
		assertThat(res, is(base));
	}
}
