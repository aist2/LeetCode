package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
    	Set<String> beginSet = new HashSet<String>();
    	Set<String> endSet = new HashSet<String>();
    	Set<String> visited = new HashSet<String>();

    	beginSet.add(beginWord);
    	endSet.add(endWord);
    	int len = 0;
    	while (!beginSet.isEmpty() && !endSet.isEmpty()) {
    		if (beginSet.size() > endSet.size()) {
    			Set<String> tmp = beginSet;
    			beginSet = endSet;
    			endSet = tmp;
    		}
        	Set<String> next = new HashSet<String>();
    		for (String item: beginSet) {
    			char[] charArr = item.toCharArray();
    			for (int i=0; i<charArr.length; i++) {
    				for (char c='a'; c<='z'; c++) {
    					char pre = charArr[i];
    					charArr[i] = c;
    					String newStr = String.valueOf(charArr);
    					if (endSet.contains(newStr))
    						return len+2;
    					else if (wordList.contains(newStr) && !visited.contains(newStr)){
    						next.add(newStr);
    						visited.add(newStr);
    					}
    					charArr[i] = pre;
    				}
    			}
    		}
    		beginSet = next;
    		len++;
    	}
    	
    	return 0;
    }
	
	
    public static int ladderLength1(String beginWord, String endWord, Set<String> wordList) {
    	List<Integer> resList = new ArrayList<>();
    	Set<String> chosenList = new HashSet<String>();
    	chosenList.add(beginWord);
    	helper(beginWord, wordList, chosenList,resList, 1, endWord);
    	if (resList.isEmpty())
    		return 0;
    	else {
    		int count = Integer.MAX_VALUE;
    		for (int item: resList) {
    			count = Math.min(count, item);
    		}
    		return count;
    	}
    }
    
    private static void helper(String str, Set<String> wordList, Set<String> chosenList, List<Integer> resList, int count, String endWord) {
    	for (int i=0; i<str.length(); i++) {
    		if (compare(str, endWord, i)) {
    			resList.add(count+1);
    			return;
    		}
    	}
    	for (int i=0; i<str.length(); i++) {
    		for (String item: wordList) {
    			if (!chosenList.contains(item) && compare(str, item, i)) {
    				chosenList.add(item);
    				helper(item, wordList, chosenList, resList, count+1, endWord);
    				chosenList.remove(item);
    			}
    		}
    	}
    }

    
    private static boolean compare(String str1, String str2, int exclude) {
    	for (int i=0; i<str1.length(); i++) {
    		if (i!=exclude && str1.charAt(i) != str2.charAt(i)) {
    			return false;
    		}
    	}
    	return true;
    }
}
