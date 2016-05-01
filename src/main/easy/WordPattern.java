package easy;

import java.util.HashMap;
import java.util.Map;


public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        return wordPattern1(pattern, str);
    }
    
    public static boolean wordPattern1(String pattern, String str) {
    	Character patternChar;
    	String[] words = str.split(" ");
    	String word;
    	Map<Character,String> map = new HashMap<Character,String>();
    	Map<String,Character> reverseMap = new HashMap<String,Character>();
    	if (pattern.length()!=words.length){
    		return false;
    	}
    	for (int i=0; i<pattern.length(); i++){
    		patternChar = pattern.charAt(i);
    		word = words[i];
    		if ((!map.containsKey(patternChar)) && (!reverseMap.containsKey(word))){
    			map.put(patternChar,word);
    			reverseMap.put(word, patternChar);
    		}
    		else if (patternChar.equals(reverseMap.get(word)) && word.equals(map.get(patternChar))) {
    			continue;
    		}
    		else {
    			return false;
    		}
    	}
        return true;
    }
}
