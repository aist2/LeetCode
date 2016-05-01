package medium;
import java.util.ArrayList;
import java.util.List;


public class PalindromePartition {
    public static List<List<String>> partition(String s) {
    	List<List<String>> resList = new ArrayList<>();
    	helper(s, 0, resList, new ArrayList<String>());
        return resList;
    }
    
    private static void helper(String s, int pos, List<List<String>> resList, List<String> currList) {
    	if (pos >= s.length()) {
    		resList.add(new ArrayList<String>(currList));
    	}
    	for (int i=pos; i<s.length(); i++) {
    		if (isPalindrome(s, pos, i)) {
    			currList.add(s.substring(pos, i+1));
    			helper(s, i+1, resList, currList);
    			currList.remove(currList.size()-1);
    		}
    	}
    }
    
    private static boolean isPalindrome(String s, int lo, int hi) {
    	while (lo < hi) {
    		if (s.charAt(lo) != s.charAt(hi))
    			return false;
    		lo++;
    		hi--;
    	}
    	return true;
    }
}
