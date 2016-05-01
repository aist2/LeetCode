package medium;
import java.util.LinkedList;
import java.util.List;


public class RestoreIpAddress {
    public static List<String> restoreIpAddresses(String s) {
    	List<String> resList = new LinkedList<>();
    	List<String> currList = new LinkedList<>();
    	helper(resList,s,0,currList);
        return resList;
    }
    
    private static void helper(List<String> resList, String s, int idx, List<String> currList) {
    	if (idx == s.length() && currList.size()==4) {
    		StringBuilder builder = new StringBuilder();
    		for (String str: currList) {
    			builder.append(str + ".");
    		}
    		builder.setLength(builder.length()-1);
    		resList.add(builder.toString());
    		return;
    	} else if (currList.size()==4) {
    		return;
    	}
    	int n = 1;
    	while (idx+n-1 < s.length()) {
    		String str = s.substring(idx, idx+n);
    		if (Integer.parseInt(str) <= 255) {
    			currList.add(str);
    			helper(resList,s,idx+n,currList);
    			currList.remove(currList.size()-1);
    			if (str.equals("0"))
    				return;
    		} else {
    			return;
    		}
    		n++;
    	}
    }
}
