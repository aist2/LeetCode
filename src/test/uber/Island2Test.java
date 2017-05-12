package uber;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ericli on 9/5/17.
 */
public class Island2Test {
    @Test
    public void numIslands2() throws Exception {
        int[][] input = {{0,0}, {0,1}, {1,2}, {2,1}};
        List res = Island2.numIslands2(3, 3, input);
        List expected = Arrays.asList(1,1,2,3);
        assertThat(res, is(expected));
    }

}