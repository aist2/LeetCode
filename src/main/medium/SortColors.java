package medium;

public class SortColors {
	public static void sortColors(int[] nums) {
		sortColors2(nums);
	}
	
    public static void sortColors1(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
    	for (int i=0; i<nums.length; i++) {
    		switch (nums[i]) {
    		case 0: count0++; break;
    		case 1: count1++; break;
    		case 2: count2++; break;
    		}
        }
    	int idx = 0;
    	for (int i=0; i<count0; i++) {
    		nums[idx++] = 0;
    	}
    	for (int i=0; i<count1; i++) {
    		nums[idx++] = 1;
    	}
    	for (int i=0; i<count2; i++) {
    		nums[idx++] = 2;
    	}
    }
    
    public static void sortColors2(int[] nums) {
    	int left = 0, right = nums.length - 1;
    	for (int i = 0; i<= right; ) {
    		if (nums[i] == 0) {
    			nums[i] = nums[left];
    			nums[left] = 0;
    			i++;
    			left++;
    		} else if (nums[i] == 2) {
    			nums[i] = nums[right];
    			nums[right] = 2;
    			right--;
    		} else
    			i++;
    	}
    }
}
