package medium;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LetterCombinations {
	public static List<String> letterCombinations(String digits) {
	    LinkedList<String> ans = new LinkedList<String>();
	    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    ans.add("");
	    for(int i =0; i<digits.length();i++){
	        int x = Character.getNumericValue(digits.charAt(i));
	        while(ans.peek().length()==i){
	            String t = ans.remove();
	            for(char s : mapping[x].toCharArray())
	                ans.add(t+s);
	        }
	    }
	    return ans;
	}
	
    public static List<String> letterCombinations1(String digits) {
    	String[] map = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	List<String> resList = new ArrayList<>();
    	if (digits==null || digits.length() == 0) return resList;
    	StringBuilder builder = new StringBuilder();
    	helper(digits,0,builder,map,resList);
        return resList;
    }
    
    private static void helper(String digits, int idx, StringBuilder builder, String[] map, List<String> resList) {
    	if (idx >= digits.length()) {
    		resList.add(builder.toString());
    		return;
    	}
    	int digit = digits.charAt(idx)-'0';
    	if (!(digit>=2 && digit<=9))
    		return;
    	String strMap = map[digit-2];
    	for (int i=0; i<strMap.length(); i++){
    		builder.append(strMap.charAt(i));
    		helper(digits,idx+1,builder,map,resList);
    		builder.deleteCharAt(builder.length()-1);
    	}
    }
}
