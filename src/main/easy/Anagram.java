package easy;


public class Anagram {
    public static boolean isAnagram(String s, String t) {
        return isAnagram2(s,t);
    }
    
    public static boolean isAnagram1(String s, String t) {
    	int[] map = new int[(int)'z'+1];
    	int tmpInt;
    	int count=0;
    	if (s.length()!=t.length()) return false;
    	for (int i=0; i<s.length(); i++){
    		tmpInt = (int)s.charAt(i);
    		if (map[tmpInt]<0){
    			count+=1;
    		}
    		map[tmpInt]+=1;
    		
    		tmpInt = (int)t.charAt(i);
    		if (map[tmpInt]>0){
    			count+=1;
    		}
    		map[tmpInt]-=1;
    	}
        return (count==s.length());
    }
    
    public static boolean isAnagram2(String s, String t) {
    	int[] map = new int[26];
    	if (s.length()!=t.length()) return false;
    	for (int i=0; i<s.length(); i++) {
    		map[(int)s.charAt(i)-'a']+=1;
    		map[(int)t.charAt(i)-'a']-=1;
    	}
    	for (int i : map) if (i!=0) return false;
    	return true;
    }
}
