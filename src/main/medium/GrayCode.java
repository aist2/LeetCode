package medium;
import java.util.ArrayList;
import java.util.List;


public class GrayCode {
    public static List<Integer> grayCode(int n) {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(0);
    	if (n==0) return list;
    	helper(list,0,n-1);
        return list;
    }
    
    private static int helper(List<Integer> list, int val, int n) {
    	if (n==0) {
    		val = flip(val,n);
    		list.add(val);
    		return val;
    	}
    		
    	val = helper(list,val,n-1);
    	val = flip(val,n);
    	list.add(val);
    	val = helper(list,val,n-1);
    	return val;
    }
    private static int flip(int val, int idx) {
    	int op = 1;
    	op <<= idx;
    	return val^op;
    }
}
