package medium;
import java.util.Arrays;

public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3)
			return 0;
		Arrays.sort(nums);
		int res = Integer.MAX_VALUE;
		int minDiff = Integer.MAX_VALUE;
		int p1;
		int lo;
		int hi;
		for (p1 = 0; p1 < nums.length - 2; p1++) {
			lo = p1 + 1;
			hi = nums.length - 1;
			while (lo < hi) {
				int sum = nums[p1] + nums[lo] + nums[hi];
				int diff = target - sum;
				if (diff == 0)
					return sum;
				if (Math.abs(diff) < minDiff) {
					res = sum;
					minDiff = Math.abs(target - res);
				}
				if (sum > target) {
					while (lo < hi && nums[hi] == nums[hi - 1])
						hi--;
					hi--;
				} else {
					while (lo < hi && nums[lo] == nums[lo + 1])
						lo++;
					lo++;
				}
			}
			while (p1 < nums.length - 2 && nums[p1] == nums[p1 + 1])
				p1++;
		}
		return res;
	}
}
