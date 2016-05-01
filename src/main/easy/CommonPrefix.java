package easy;
import java.util.Arrays;


public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        return longestCommonPrefix2(strs);
    }
    
    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        
    	int idx = 0;
        StringBuilder pattern = new StringBuilder();
    	while (true) {
    		if (strs[0].length() < idx+1) return pattern.toString();
    		char currCh = strs[0].charAt(idx);
    		for (int i=1; i<strs.length; i++) {
    			if (strs[i].length() < idx+1) return pattern.toString();
    			if (currCh != strs[i].charAt(idx)) return pattern.toString();
    			
    		}
    		pattern.append(currCh);
    		idx++;
    	}
//    	return "";
    }
    
    public static String longestCommonPrefix2(String[] strs) {
        StringBuilder result = new StringBuilder();

        if (strs!= null && strs.length > 0){

            Arrays.sort(strs);

            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();

            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }
}
