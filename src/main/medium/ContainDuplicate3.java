package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ContainDuplicate3 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	if (nums==null||nums.length==0||t<0) return false;
    	TreeSet<Long> set = new TreeSet<>();
    	for (int i=0; i<nums.length; i++) {
    		long currVal = (long) nums[i];
    		Long floor = set.floor(currVal+t);
    		Long ceiling = set.ceiling(currVal-t);
    		if ((floor!=null && floor >= currVal) ||
    				(ceiling!=null && ceiling<=currVal)) {
    			return true;
    		} else {
    			set.add(currVal);
    		}
    		if (set.size() > k) {
    			long preVal = (long)nums[i-k];
    			set.remove(preVal);
    		}
    			
    	}
        return false;
    }
    public static boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
    	if (nums==null||nums.length==0||t<0) return false;
    	Map<Long, Long> map = new HashMap<>();
    	int bucketSize = t+1;
    	for (int i=0; i<nums.length; i++) {
    		long currVal = (long)nums[i] - Integer.MIN_VALUE;
    		long iBucket = currVal / bucketSize;
    		if (map.containsKey(iBucket) ||
    				(map.containsKey(iBucket+1) && Math.abs(map.get(iBucket+1) - currVal) <= t) ||
    				(map.containsKey(iBucket-1) && Math.abs(map.get(iBucket-1) - currVal) <= t))
    			return true;
    		else
    			map.put(iBucket, currVal);
    		if (map.size() > k) {
    			long removeKey = ((long)nums[i-k] - Integer.MIN_VALUE) / bucketSize;
    			map.remove(removeKey);
    		}
    	}
        return false;
    }
}
