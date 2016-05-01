package medium;
import java.util.Arrays;
import java.util.List;


public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int cols = triangle.get(rows-1).size();
    	int[] m = new int[cols];
    	for (int i = 0; i<rows; i++) {
    		for (int j = triangle.get(i).size()-1; j>0; j--) {
    			if (j == triangle.get(i).size()-1)
    				m[j] = m[j-1] + triangle.get(i).get(j);
    			else
    				m[j] = Math.min(m[j-1], m[j]) + triangle.get(i).get(j);
    		}
    		m[0] += triangle.get(i).get(0);
    	}
    	Arrays.sort(m);
    	return m[0];
    }
}
