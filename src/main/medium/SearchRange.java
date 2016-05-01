package medium;
public class SearchRange {
	public static int[] searchRange(int[] nums, int target) {
		return searchRange1(nums, target);
	}

	public static int[] searchRange2(int[] nums, int target) {
		int[] notFound = new int[] { -1, -1 };
		if (nums.length < 1)
			return notFound;
		int left = 0;
		int right = nums.length - 1;
		int i = 0;
		int j = nums.length - 1;
		int mid;
		while (i < j) {
			mid = i + (j - i) / 2;
			if (nums[mid] >= target)
				j = mid;
			else
				i = mid + 1;
		}
		if (nums[i] != target)
			return notFound;
		else
			left = i;
		j = nums.length - 1;
		while (i < j) {
			mid = i + (j - i) / 2 + 1;
			if (nums[mid] > target)
				j = mid - 1;
			else
				i = mid;
		}
		if (nums[j] != target)
			return notFound;
		else
			right = j;
		return new int[] { left, right };
	}

	public static int[] searchRange1(int[] nums, int target) {
		if (nums.length < 1)
			return new int[] { -1, -1 };
		int left = 0;
		int right = nums.length - 1;
		int mid;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				if (left == right)
					return new int[] { -1, -1 };
				if (nums[mid + 1] > target)
					return new int[] { -1, -1 };
				else if (nums[mid + 1] <= target)
					mid += 1;
				left = mid;
			} else if (nums[mid] > target) {
				if (left == right)
					return new int[] { -1, -1 };
				right = mid;
			} else if (nums[mid] == target) {
				if (nums[left] == target && nums[right] == target) {
					return new int[] { left, right };
				}
				while (nums[left] < target)
					left++;
				while (nums[right] > target)
					right--;
			}
		}
		return new int[] { -1, -1 };
	}
}
