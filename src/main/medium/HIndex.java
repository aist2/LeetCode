package medium;
import java.util.Arrays;

public class HIndex {
	public static int hIndex(int[] citations) {
		int len = citations.length;
		if (len == 0) return 0;
		int[] arr = new int[len+1];
		for (int item:citations) {
			if (item >= len)
				arr[len] += 1;
			else
				arr[item] += 1;
		}
		int sum = 0;
		for (int i=len;i>=0;i--) {
			sum += arr[i];
			if (sum >= i)
				return i;
		}
		return 0;
	}
	
    public static int hIndex1(int[] citations) {
        Arrays.sort(citations);
        int count;
        for (int i=0;i<citations.length;i++) {
        	count = citations.length - i;
        	if (citations[i] >= count)
        		return count;
        }
        return 0;
    }
}
