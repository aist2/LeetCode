package medium;
import java.util.Arrays;
import java.util.List;

import medium.GroupAnagram;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GroupAnagramTest {

	@Test
	public final void test() {
		List<List<String>> expected = Arrays.asList(
				Arrays.asList("ate","eat","tea"),
				Arrays.asList("nat","tan"),
				Arrays.asList("bat"));
		assertThat(GroupAnagram.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}),is(expected));
	}

}
