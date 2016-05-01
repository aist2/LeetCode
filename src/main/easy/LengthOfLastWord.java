package easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        return lengthOfLastWord1(s);
    }
    
    public static int lengthOfLastWord1(String s) {
    	if (s==null || s.length()==0) return 0;
    	char ch;
    	int i=s.length()-1;
    	int count = 0;
    	for (;i>=0;i--){
    		ch = s.charAt(i);
    		if (ch!=' ') {
    			count++;
    			continue;
    		} else {
    			if (count > 0) break;
    		}
    	}
        return count;
    }
}
