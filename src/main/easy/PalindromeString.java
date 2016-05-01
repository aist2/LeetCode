package easy;

public class PalindromeString {
    public static boolean isPalindrome(String s) {
        return isPalindrome1(s);
    }
    
    public static boolean isPalindrome1(String s) {
    	s = s.toLowerCase();
    	int pLeft = 0;
    	int pRight = s.length()-1;
    	char chLeft;
    	char chRight;
    	while (pLeft < pRight) {
    		chLeft = s.charAt(pLeft);
    		if (!Character.isLetterOrDigit(chLeft)){
    			pLeft++;
    			continue;
    		}
    		chRight = s.charAt(pRight);
    		if (!Character.isLetterOrDigit(chRight)){
    			pRight--;
    			continue;
    		}
    		if (chLeft == chRight) {
    			pLeft++;
    			pRight--;
    		} else {
    			return false;
    		}
    	}
        return true;
    }
}
