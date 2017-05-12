package uber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ericli on 10/5/17.
 */
public class NumArrayTest {
    @Test
    public void sumRange() throws Exception {
        int[] nums = {1,3,5,7,9};
        NumArray obj = new NumArray(nums);
        assertEquals(4, obj.sumRange(0,1));
        assertEquals(15, obj.sumRange(1,3));
        obj.update(2, 0);
        assertEquals(4, obj.sumRange(0,1));
        assertEquals(10, obj.sumRange(1,3));
    }

}