package easy;

public class ZigZag {
    public static String convert(String s, int numRows) {
        return convert1(s, numRows);
    }
    
    public static String convert1(String s, int numRows) {
    	if (numRows < 2) return s;
    	StringBuilder[] arr = new StringBuilder[numRows];
    	for (int i=0; i<arr.length; i++) {
    		arr[i] = new StringBuilder();
    	}
    	int rowIndex = 0;
    	int inc = 1;
    	for (int i=0; i<s.length(); i++){
    		if (rowIndex == numRows-1) {
    			inc = -1;
    		} else if (rowIndex == 0) {
    			inc = 1;
    		}
    		arr[rowIndex].append(s.charAt(i));
    		rowIndex += inc;
    	}
    	for (int i=1; i<arr.length; i++) {
    		arr[0].append(arr[i]);
    	}
        return arr[0].toString();
    }
}
