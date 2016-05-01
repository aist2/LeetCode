package easy;

public class FactorialTrailingZeros {
    public static int trailingZeroes(int n) {
        return trailingZeroes1(n);
    }
    
    public static int trailingZeroes1(int n) {
    	int count=0;
    	while (n!=0){
    		n /= 5;
    		count+=n;
    	}
    	return count;
    }
}
