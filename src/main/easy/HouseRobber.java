package easy;
import java.util.Arrays;


public class HouseRobber {
    public int rob1(int[] nums) {
    	if (nums==null||nums.length==0) return 0;
    	if (nums.length==1) return nums[0];
    	if (nums.length==2) return Math.max(nums[0], nums[1]);
    	
    	int[] maxArr = new int[nums.length];
        maxArr[0] = nums[0];
        maxArr[1] = Math.max(nums[1],maxArr[0]);
    	for (int i=2; i<nums.length; i++) {
        	maxArr[i] = Math.max(nums[i] + maxArr[i-2], maxArr[i-1]);
        }
    	return maxArr[nums.length-1];
    }
	
    public int rob(int[] nums) {
    	int[] maxArr = new int[nums.length];
    	Arrays.fill(maxArr, -1);
        return maxAmt(nums.length-1,maxArr,nums);
    }
    
    private int maxAmt(int currNode, int[] maxArr, int[] nums){
    	if (currNode<0) return 0;
    	if (maxArr[currNode] > -1) return maxArr[currNode];
    	maxArr[currNode] = Math.max(nums[currNode] + maxAmt(currNode-2,maxArr,nums), maxAmt(currNode-1,maxArr,nums));
    	return maxArr[currNode];
    }
    
}
