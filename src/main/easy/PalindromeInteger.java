package easy;

public class PalindromeInteger {
    public static boolean isPalindrome(int x) {
        return isPalindrome1(x);
    }
    
    public static boolean isPalindrome1(int x) {
    	int original = x;
    	int reverse = 0;
    	if (x<0) return false;
    	while (x!=0) {
    		reverse *= 10;
    		reverse += x%10;
    		x /= 10;
    	}
    	if (original == reverse) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
