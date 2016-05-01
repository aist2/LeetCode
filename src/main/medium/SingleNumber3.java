package medium;

public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
    	int diff = 0;
    	for (int item: nums) {
    		diff ^= item;
    	}
    	diff = diff & ~(diff-1);
    	int[] res = {0,0};
    	for (int item: nums) {
    		if ((item & diff) == 0)
    			res[0] ^= item;
    		else
    			res[1] ^= item;
    	}
        return res;
    }
}
