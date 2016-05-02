package medium;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static boolean wordBreak(String s, Set<String> wordDict) {
    	boolean[] arr = new boolean[s.length()+1];
    	arr[0] = true;
    	for (int i=1; i<= s.length(); i++) {
    		for (int j=0; j<i; j++) {
    			if (arr[j] && wordDict.contains(s.substring(j, i))) {
    				arr[i] = true;
    				break;
    			}
    		}
    	}
        return arr[s.length()];
    }
	
    public static boolean wordBreak1(String s, Set<String> wordDict) {
    	Set<String> pendingSet = new HashSet<>();
    	pendingSet.add(s);
    	while (!pendingSet.isEmpty()) {
    		Set<String> next = new HashSet<>();
    		for (String item: pendingSet) {
    			for (String word: wordDict) {
    				if (word.equals(item))
    					return true;
    				else if (item.startsWith(word)) {
    					String newStr = item.substring(word.length(), item.length());
    					next.add(newStr);
    				}
    			}
    		}
    		pendingSet = next;
    	}
        return false;
    }
}
