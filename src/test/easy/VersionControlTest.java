package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.FirstBadVersion;


public class VersionControlTest {

	@Test
	public final void testIsBadVersion() {
		FirstBadVersion obj = new FirstBadVersion();
		assertEquals(5,obj.firstBadVersion(8));
	}

}
