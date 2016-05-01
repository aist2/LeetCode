package medium;
import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		return twoSum2(nums, target);
	}

	public static int[] twoSum1(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return null;
		int p1 = 0;
		int p2;
		while (p1 < nums.length - 1) {
			p2 = p1 + 1;
			while (p2 < nums.length) {
				if (nums[p1] + nums[p2] == target) {
					return new int[] { p1, p2 };
				}
				p2++;
			}
			p1++;
		}
		return null;
	}

	public static int[] twoSum2(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i<nums.length; i++){
			if (map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
			if (!map.containsKey(nums[i])) map.put(nums[i], i);
		}
		return null;
	}
}
