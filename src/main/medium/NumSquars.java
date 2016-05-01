package medium;
import java.util.ArrayList;
import java.util.List;


public class NumSquars {
	static List<Integer> list = new ArrayList<>();
	
    public static int numSquares(int n) {
    	if (n<1) return 0;
    	if (list.size() == 0)
    		list.add(0);
    	while (list.size() < n+1) {
    		int i = list.size();
    		int curr = Integer.MAX_VALUE;
    		for (int j=1; j*j<=i; j++)
        		curr = Math.min(curr, list.get(i-j*j)+1);
    		list.add(curr);
    	}
        return list.get(n);
    }
    
}
