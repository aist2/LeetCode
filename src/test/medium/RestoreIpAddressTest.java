package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.RestoreIpAddress;

import org.junit.Test;

public class RestoreIpAddressTest {

	@Test
	public final void test() {
		List<String> expected = Arrays.asList("255.255.11.135", "255.255.111.35");
		List<String> actual = RestoreIpAddress.restoreIpAddresses("25525511135");
		assertThat(actual, is(expected));
	}
	@Test
	public final void test1() {
		List<String> expected = Arrays.asList("0.10.0.10","0.100.1.0");
		List<String> actual = RestoreIpAddress.restoreIpAddresses("010010");
		assertThat(actual, is(expected));
	}
}
