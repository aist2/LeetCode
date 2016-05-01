package medium;
import java.util.Arrays;
import java.util.List;

import medium.LetterCombinations;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LetterCombinationsTest {

	@Test
	public final void test() {
		List<String> expected = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
		List<String> actual = LetterCombinations.letterCombinations("23");
		assertThat(actual, is(expected));
	}

}
