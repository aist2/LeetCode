package medium;

public class HIndex2 {
	public static int hIndex(int[] citations) {
		if (citations==null || citations.length==0) return 0;
		int lo = 0;
		int hi = citations.length-1;
		int mid;
		int count;
		while (lo<hi) {
			mid = lo+(hi-lo)/2;
			count = citations.length - mid;
			int curr = citations[mid];
			if (curr == count)
				return count;
			else if (curr > count)
				hi = mid;
			else
				lo = mid+1;
		}
		count = citations.length - lo;
		if (citations[lo] >= count)
			return count;
		else
			return 0;
	}
	
    public static int hIndex1(int[] citations) {
        int count;
        for (int i=0;i<citations.length;i++) {
        	count = citations.length - i;
        	if (citations[i] >= count)
        		return count;
        }
        return 0;
    }
}
