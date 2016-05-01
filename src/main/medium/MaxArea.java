package medium;
public class MaxArea {
	public static int maxArea(int[] height) {
		int max = 0;
		int left = 0;
		int right = height.length-1;
		int curr = 0;
		while (left<right) {
			curr = Math.min(height[left], height[right]) * (right-left);
			if (curr > max) max = curr;
			if (height[left] < height[right])
				left++;
			else
				right--;
		}
		return max;
	}
}
