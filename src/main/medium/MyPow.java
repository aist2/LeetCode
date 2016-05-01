package medium;

public class MyPow {
    public static double myPow(double x, int n) {
    	if (n==0) return 1;
    	if (x==1.0) return 1.0;
    	if (n==Integer.MIN_VALUE) 
    		return myPow(1/x,Integer.MAX_VALUE-1);
    	if (n<0)
    		return myPow(1/x,-n);
    	double res = myPow(x,n/2);
    	res *= res;
    	if (n%2 != 0)
    		res *= x;
    	return res;
    }
}
