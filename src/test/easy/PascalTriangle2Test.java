package easy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;



import org.junit.Test;

import easy.PascalTriangle2;
import static org.hamcrest.CoreMatchers.*;

public class PascalTriangle2Test {

	@Test
	public void testGetRow() {
		List<Integer> base = Arrays.asList(1,3,3,1);
		List<Integer> res = PascalTriangle2.getRow(3);
		assertThat(res,is(base));
	}

}
