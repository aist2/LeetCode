package medium;
import java.util.ArrayList;
import java.util.List;


public class Permutation {
	public static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		helper(list, new ArrayList<Integer>(), nums,0);
		return list;
	}
	
	private static void helper(List<List<Integer>>list, List<Integer> subList, int[] nums, int start){
		if (start == nums.length){
			list.add(new ArrayList<Integer>(subList));
			return;
		}
		for (int i = start; i<nums.length; i++){
			int tmp = nums[i];
			nums[i] = nums[start];
			nums[start] = tmp;
			subList.add(nums[start]);
			helper(list,subList,nums,start+1);
			subList.remove(subList.size()-1);
			tmp = nums[i];
			nums[i] = nums[start];
			nums[start] = tmp;
		}
	}
}
