package easy;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        return isPowerOfThree2(n);
    }
    
    public static boolean isPowerOfThree1(int n) {
    	if (n==1) return true;
    	if (n<3) return false;
    	while (n!=1) {
    		if (n%3!=0) return false;
    		n /= 3;
    	}
        return true;
    }
    
    public static boolean isPowerOfThree2(int n) {
    	double res = Math.log(n)/Math.log(3);
    	return (n>0 && Math.abs(Math.round(res) - res) < 1e-14);
    }
    
    public static boolean isPowerOfThree3(int n) {
    	double res = Math.log10(n)/Math.log10(3);
    	return (n>0 && res%1==0);
    }
    
    public static boolean isPowerOfThree4(int n) {
    	return Integer.toString(n, 3).matches("10*");
    }
    
}
