package easy;

public class HammingWeight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int count = 0;
    	for (int i=0; i<32; i++) {
    		count += n & 1;
    		n >>>= 1;
    	}
        return count;
    }
}