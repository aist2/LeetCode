package medium;

public class NumDecodings {
    public static int numDecodings(String s) {
    	if (s==null|s.length()==0) return 0;
    	
    	int prev=1, prevTwo=1, res=0;
    	if (s.charAt(0) == '0')
    		return 0;
    	if (s.length()==1) return 1;
    	for (int i=1; i<s.length(); i++) {
    		res=0;
    		char currChar = s.charAt(i);
    		char prevChar = s.charAt(i-1);
    		if (prevChar == '1' ||
    			(prevChar == '2' && currChar-'0' <= 6))
    			res += prevTwo;
    		if (currChar!='0')
    			res += prev;
    		prevTwo = prev;
    		prev = res;
    	}
    	return res;
    }
}
