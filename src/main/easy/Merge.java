package easy;


public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        merge2(nums1,m,nums2,n);
    }
    
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] nums1Copy = new int[nums1.length];
        System.arraycopy(nums1, 0, nums1Copy, 0, nums1.length);
        
        while (k < m+n && i < m && j < n) {
        	if (nums1Copy[i] < nums2[j]) {
        		nums1[k] = nums1Copy[i];
        		i++;
        	}
        	else {
        		nums1[k] = nums2[j];
        		j++;
        	}
        	k++;
        }
        
        if (m > i && n <= j ) {
        	for (;i<m;i++){
        		nums1[k] = nums1Copy[i];
        		k++;
        	}
        }
        else if (m <= i && n > j) {
        	for (;j<n;j++){
        		nums1[k] = nums2[j];
        		k++;
        	}
        }
    }
    
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
    	int i=m-1;
    	int j=n-1;
    	int k=m+n-1;
    	while (i>=0 && j>=0) {
    		if (nums1[i] > nums2[j]) {
    			nums1[k--] = nums1[i--];
    		}
    		else {
    			nums1[k--] = nums2[j--];
    		}
    	}
    	while (j>=0) {
    		nums1[k--] = nums2[j--];
    	}
    }
}
