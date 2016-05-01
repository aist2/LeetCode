package medium;
import java.util.ArrayList;
import java.util.List;


public class Combine {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        helper(list, subList, n, k, 1);
        return list;
    }
    
    private static void helper(List<List<Integer>> list, List<Integer> subList, int n, int k, int i) {
    	if (subList.size() == k) {
    		list.add(new ArrayList<Integer>(subList));
    		return;
    	}
    	for (int j=i; j<=n; j++) {
    		subList.add(j);
    		helper(list,subList,n,k,j+1);
    		subList.remove(subList.size()-1);
    	}
    }
}
