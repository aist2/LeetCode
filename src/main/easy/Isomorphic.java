package easy;

import java.util.HashMap;
import java.util.Map;


public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        return isIsomorphic1(s,t);
    }
    
    public static boolean isIsomorphic1(String s, String t) {
    	Map<Character,Character> mapAB = new HashMap<Character,Character>();
    	Map<Character,Character> mapBA = new HashMap<Character,Character>();
    	for (int i=0; i<s.length(); i++) {
    		Character a = s.charAt(i);
    		Character b = t.charAt(i);
    		if ((!mapAB.containsKey(a))&&(!mapBA.containsKey(b))) {
    			mapAB.put(a, b);
    			mapBA.put(b, a);
    		}
    		else if (!(mapAB.get(a)==b && mapBA.get(b)==a)) {
    			return false;
    		}
    	}
        return true;
    }
}
