package easy;

import java.util.Deque;
import java.util.LinkedList;


public class Rotate {
    public static void rotate(int[] nums, int k) {
    	rotate2(nums,k);
    }
    
    public static void rotate1(int[] nums, int k) {
        int kMod = k % nums.length;
        int iBufferStart = kMod;
        int iDest;
        Deque<Integer> queue = new LinkedList<Integer>();
        for (int i=0;i<nums.length;i++){
        	iDest = (i+kMod)%nums.length;
        	if ( iDest >= iBufferStart){
        		queue.add(nums[iDest]);
        	}
        	if (i<iBufferStart) {
        		nums[iDest] = nums[i];
        	}
        	else {
        		nums[iDest] = queue.poll();
        	}
        }
    }
    
    public static void rotate2(int[] nums, int k) {
        int kMod = k % nums.length;
        int iDest;
        int[] nums2 = new int[nums.length];
        nums2 = nums.clone();
        for (int i=0;i<nums.length;i++){
        	iDest = (i+kMod)%nums.length;
    		nums[iDest] = nums2[i];
        } 
    }
    
    public static void rotate3(int[] nums, int k) {
    	int kMod = k % nums.length;
    	reverse(0,nums.length-kMod-1,nums);
    	reverse(nums.length-kMod,nums.length-1,nums);
    	reverse(0,nums.length-1,nums);
    }
    
    public static void reverse(int start, int end, int[]nums) {
    	int tmp;
    	while (start<end){
    		tmp=nums[start];
    		nums[start++]=nums[end];
    		nums[end--]=tmp;
    	}
    }
}
