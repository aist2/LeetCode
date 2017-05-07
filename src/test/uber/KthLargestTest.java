package uber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ericli on 6/5/17.
 */
public class KthLargestTest {
    @Test
    public void findKthLargest1() throws Exception {
        assertEquals(5, KthLargest.findKthLargestMaxHeap(new int[] {3,2,1,5,6,4}, 2));
    }

    @Test
    public void findKthLargest2() throws Exception {
        assertEquals(5, KthLargest.findKthLargestMinHeap(new int[] {3,2,1,5,6,4}, 2));
    }

    @Test
    public void findKthLargest3() throws Exception {
        assertEquals(5, KthLargest.findKthLargestQuick(new int [] {3,2,1,5,6,4}, 2));
    }

}