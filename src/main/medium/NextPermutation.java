package medium;
public class NextPermutation {
	public static void nextPermutation(int[] nums) {
		if (nums.length <= 1)
			return;
		int idx = -1;
		int swapIdx = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			reverse(nums, 0, nums.length - 1);
			return;
		}
		for (int i = nums.length - 1; i > idx; i--) {
			if (nums[i] > nums[idx]) {
				swapIdx = i;
				break;
			}
		}
		swap(nums, idx, swapIdx);
		reverse(nums, idx + 1, nums.length - 1);
	}

	private static void swap(int[] nums, int i1, int i2) {
		int tmp = nums[i1];
		nums[i1] = nums[i2];
		nums[i2] = tmp;
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}
}
