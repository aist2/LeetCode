package easy;

import java.util.HashSet;
import java.util.Set;


public class HappyNumber {
    public static boolean isHappy(int n) {
        return isHappy1(n);
    }
    
    public static boolean isHappy1(int n) {
    	int val;
    	Set<Integer> set = new HashSet<Integer>();
    	while (n!=1) {
    		if (!set.add(n)) return false;
    		val = n;
    		n = 0;
    		while (val != 0) {
    			n += (val%10) * (val%10);
    			val = val/10;
    		}
    	}
        return true;
    }
    
}
