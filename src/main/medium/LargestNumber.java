package medium;
import java.util.Arrays;
import java.util.Comparator;


public class LargestNumber {
    public static String largestNumber(int[] nums) {
    	if (nums==null||nums.length==0) return "";
    	Comparator<String> comparator = new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				String str1 = o1 + o2;
				String str2 = o2 + o1;
				return str1.compareTo(str2);
			}
    	};
    	String[] arr = new String[nums.length];
    	for (int i=0; i<nums.length; i++) {
    		arr[i] = String.valueOf(nums[i]);
    	}
    	Arrays.sort(arr, comparator);
    	if (Integer.valueOf(arr[arr.length-1])==0) return "0";
    	StringBuilder builder = new StringBuilder();
    	for (String item: arr) {
    		builder.insert(0, item);
    	}
        return builder.toString();
    }
}
