package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.PalindromePartition;

import org.junit.Test;


public class PalindromePartitionTest {

	@Test
	public final void test() {
		List<List<String>> expected = Arrays.asList(Arrays.asList("aa","b"),Arrays.asList("a","a","b"));
		List<List<String>> actual = PalindromePartition.partition("aab");
		assertThat(actual,is(expected));
	}

}
