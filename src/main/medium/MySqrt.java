package medium;

public class MySqrt {
    public static int mySqrt(int x) {
        if (x<=1)
        	return x;
        int left = 1;
        int right = x;
        int mid;
        while (left < right) {
        	mid = left + (right-left)/2;
        	if (mid == x/mid)
        		return mid;
        	else if (mid<x/mid)
        		left = mid + 1;
        	else
        		right = mid;
        }
        return left-1;
    }
}
