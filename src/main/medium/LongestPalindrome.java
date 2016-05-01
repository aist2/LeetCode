package medium;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 1) return "";
        String longestRes = s.substring(0, 1);
        for (int i=1; i<len; i++) {
        	String res = helper(s, i-longestRes.length(), i);
        	if (res.length() > longestRes.length())
        		longestRes = res;
        	res = helper(s, i-longestRes.length()-1, i);
        	if (res.length() > longestRes.length())
        		longestRes = res;
        }
        return longestRes;
    }
    
    private static String helper(String s, int start, int end) {
    	if (start < 0) return "";
    	String curr = s.substring(start, end+1);
    	while (start < end) {
    		if (s.charAt(start) == s.charAt(end)) {
    			start++;
    			end--;
    		}
    		else
    			return "";
    	}
    	return curr;
    }
}
