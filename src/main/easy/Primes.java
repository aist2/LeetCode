package easy;

import java.util.HashSet;
import java.util.Set;


public class Primes {
    public static int countPrimes(int n) {
        return countPrimes2(n);
    }
    
    public static int countPrimes1(int n) {
    	//start from 2, mark all multiples of the current prime numbers as non-prime numbers.
    	if (n<=2) return 0;
    	Set<Integer> nonPrimeSet = new HashSet<Integer>();
    	int sqrtN = (int)Math.sqrt(n);
    	int tmp;
    	for (int i=2; i<=sqrtN; i++) {
    		if (!nonPrimeSet.contains(i)) {
	    		tmp = i*i;
	    		while (tmp<n) {
	    			//nonPrimeSet.add(tmp);
	    			if (!nonPrimeSet.add(tmp)) System.out.println(i+"-"+tmp);
	    			tmp += i;
	    		}
    		}
    	}
    	return n-nonPrimeSet.size()-2;
    }
    
    public static int countPrimes2(int n) {
    	boolean[] notPrime = new boolean[n];
    	int sqrtN = (int)Math.sqrt(n);
    	int count=0;
    	int tmp;
    	for (int i=2; i<=sqrtN; i++) {
    		if (notPrime[i]==false) {
	    		tmp = i*i;
	    		while (tmp<n) {
	    			notPrime[tmp]=true;
	    			tmp += i;
	    		}
    		}
    	}
    	for (int i=2; i<n; i++) {
    		if (notPrime[i]==false) count++;
    	}
    	return count;
    }
}
