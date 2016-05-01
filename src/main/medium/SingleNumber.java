package medium;
import java.util.Arrays;


public class SingleNumber {
    public static int singleNumber(int[] nums) {
        return singleNumber2(nums);
    }

    public static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i=0; i<nums.length; i++) {
        	if (i%2 == 0)
        		res += nums[i];
        	else
        		res -= nums[i];
        }
        return res;
    }
    
    public static int singleNumber2(int[] nums) {
        int res = 0;
        for (int i=0; i<nums.length; i++) {
        	res ^= nums[i];
        }
        return res;
    }

}
