package medium;
import java.util.Arrays;

public class LengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
    	if (nums==null||nums.length==0) return 0;
    	int[] arr = new int[nums.length];
    	Arrays.fill(arr, 1);
    	for (int i=1;i<nums.length;i++) 
    		for (int j=0; j<i; j++) 
    			if (nums[j] < nums[i] && arr[i] <= arr[j]) 
					arr[i] = arr[j]+1;
    	int res = 0;
    	for (int i=0; i<arr.length; i++)
    		res = Math.max(res, arr[i]);
    	return res;
    }
}
