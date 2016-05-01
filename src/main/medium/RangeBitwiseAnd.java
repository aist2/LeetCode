package medium;

public class RangeBitwiseAnd {
    public static int rangeBitwiseAnd(int m, int n) {
    	if (m==0)
    		return 0;
    	if (m==n)
    		return m;
    	int powerM = -1;
    	int tmp = m;
    	while (tmp>0){
    		tmp >>= 1;
    		powerM++;
    	}
    	int powerN = -1;
    	tmp = n;
    	while (tmp>0){
    		tmp >>= 1;
    		powerN++;
    	}
    	if (powerN > powerM)
    		return 0;
    	int val = m&n;
    	if (val==0)
    		return 0;
    	int sum = 0;
    	for (int i = powerM; i>=0; i--) {
    		if (m>>i != n>>i)
    			return sum;
    		if (((val >> i) & 1)==1) {
    			sum += 1<<i;
    		}
    	}
        return sum;
    }
}
