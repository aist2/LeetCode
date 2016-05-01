package medium;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
    	int[] uglyArr = new int[n];
    	uglyArr[0] = 1;
    	
    	int primeLen = primes.length;
    	int[] idxArr = new int[primeLen];

    	for (int i=1; i<n; i++) {
    		int minVal = Integer.MAX_VALUE;
    		for (int j=0; j<primeLen; j++) {
    			int idx = idxArr[j];
    			int prime = primes[j];
    			int val = uglyArr[idx]*prime;
    			minVal = Math.min(minVal, val);
    		}
    		uglyArr[i] = minVal;
    		for (int j=0; j<primeLen; j++) {
    			int idx = idxArr[j];
    			int prime = primes[j];
    			int val = uglyArr[idx]*prime;
    			if (uglyArr[i]==val)
    				idxArr[j] = idx+1;
    		}
    	}
        return uglyArr[n-1];
    }
}
