package medium;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import medium.PeekingIterator;

public class PeekingIteratorTest {

	@Test
	public void test() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		PeekingIterator iter = new PeekingIterator(list.iterator());
		assertEquals(1, (int)iter.peek());
		assertEquals(1, (int)iter.peek());
		assertEquals(1, (int)iter.next());
	}

}
