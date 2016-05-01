package medium;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import medium.RepeatedDna;

import org.junit.Test;

public class RepeatedDnaTest {

	@Test
	public void test() {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
		assertThat(RepeatedDna.findRepeatedDnaSequences(s),is(expected));
	}

	@Test
	public void test2() {
		String s = "AAAAAAAAAAAAA";
		List<String> expected = Arrays.asList("AAAAAAAAAA");
		assertThat(RepeatedDna.findRepeatedDnaSequences(s),is(expected));
	}
}
