package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (nums.length < 4)
			return list;
		Arrays.sort(nums);
		int lo;
		int hi;
		for (int first = 0; first < nums.length - 3; first++) {
			for (int second = first + 1; second < nums.length - 2; second++) {
				lo = second + 1;
				hi = nums.length - 1;
				int sumTarget = target - nums[first] - nums[second];
				while (lo < hi) {
					int currSum = nums[lo] + nums[hi];
					if (currSum == sumTarget) {
						list.add(Arrays.asList(nums[first], nums[second], nums[lo], nums[hi]));
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++;
						lo++;
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--;
						hi--;
						continue;
					}
					if (currSum < sumTarget) {
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++;
						lo++;
					} else {
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--;
						hi--;
					}
				}
				while (second<nums.length-2&&nums[second]==nums[second+1])
					second++;
			}
			while (first<nums.length-3&&nums[first]==nums[first+1])
				first++;
		}
		return list;
	}
}
