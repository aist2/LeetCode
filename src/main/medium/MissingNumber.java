package medium;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n;
        for (int i=0;i<n;i++) {
        	res ^= i;
        	res ^= nums[i];
        }
        return res;
    }
	
    public static int missingNumber1(int[] nums) {
        int n = nums.length;
        long res = n;
        for (int i=0;i<n;i++) {
        	res += i;
        	res -= nums[i];
        }
        return (int)res;
    }
}
