package medium;

public class NthUglyNumber {
    public static int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int nextIdx2 = 0;
        int nextIdx3 = 0;
        int nextIdx5 = 0;
        int val2,val3,val5;
        for (int i=1; i<n; i++) {
        	val2 = arr[nextIdx2] * 2;
        	val3 = arr[nextIdx3] * 3;
        	val5 = arr[nextIdx5] * 5;
        	arr[i] = Math.min(Math.min(val2, val3), val5);
        	if (arr[i] == val2)
        		nextIdx2++;
        	if (arr[i] == val3)
        		nextIdx3++;
        	if (arr[i] == val5)
        		nextIdx5++;
        }
        return arr[n-1];
    }
}
