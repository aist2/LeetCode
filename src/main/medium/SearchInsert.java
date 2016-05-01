package medium;
public class SearchInsert {
	public static int searchInsert(int[] nums, int target) {
		if (nums.length == 0)
			return 0;
		int left = 0;
		int right = nums.length - 1;
		int mid;
		while (left < right) {
			mid = left + (right - left) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				right = mid;
			else // nums[mid] < target
				left = mid + 1;
		}
		if (nums[left] == target)
			return left;
		else if (nums[left] > target)
			return left;
		else //(nums[left] > target)
			return left + 1;
	}
}
