package medium;

public class Divide {
    public static int divide(int dividend, int divisor) {
    	if (divisor==0 || (dividend == Integer.MIN_VALUE && divisor==-1))
    		return Integer.MAX_VALUE;
        boolean neg = false;
        if (dividend<0 ^ divisor<0)
        	neg = true;
        long lDividend = Math.abs((long)dividend);
        long lDivisor = Math.abs((long)divisor);
        int count = 0;
        while (lDividend >= lDivisor) {
        	long tmp = lDivisor;
        	long mul = 1;
        	while (lDividend >= (tmp << 1)) {
        		tmp <<= 1;
        		mul <<= 1;
        	}
        	lDividend -= tmp;
        	count += mul;
        }
        if (neg)
        	count = -count;
        return count;
    }
}
