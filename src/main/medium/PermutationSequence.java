package medium;
import java.util.ArrayList;
import java.util.List;


public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        int[] factorial = new int[9];
        List<Integer> list = new ArrayList<Integer>();
    	StringBuilder builder = new StringBuilder();
    	
        for (int i=0; i<n; i++)
    		list.add(i+1);
        
        factorial[0] = 1;
        for (int i=1; i<9; i++)
        	factorial[i] = factorial[i-1]*i;
        
        k--;
        for (int i=1; i<=n; i++) {
        	int idx = k / factorial[n-i];
        	int curr = list.remove(idx);
        	builder.append(Integer.toString(curr));
        	k -= idx * factorial[n-i];
        	
        }
    	return builder.toString();
    }
}
