package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.GenerateParenthesis;

import org.junit.Test;

public class GenerateParenthesisTest {

	@Test
	public final void test() {
		List<String> expected = Arrays.asList("((()))","(()())","(())()","()(())","()()()");
		List<String> actual = GenerateParenthesis.generateParenthesis(3);
		assertThat(actual, is(expected));
	}

}
