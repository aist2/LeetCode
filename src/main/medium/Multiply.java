package medium;

public class Multiply {
    public static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] arr = new int[len1+len2];
        
        for (int i=len1-1; i>=0; i--) {
        	int val1 = num1.charAt(i)-'0';
        	for (int j=len2-1; j>=0; j--) {
        		int val2 = num2.charAt(j)-'0';
        		int sum = val1 * val2;
        		int p1 = i+j;
        		int p2 = i+j+1;
        		sum += arr[p2];
        		arr[p2] = sum%10;
        		arr[p1] += sum/10;
        	}
        }
        StringBuilder str = new StringBuilder();
        int startIdx = 0;
        while (startIdx < len1+len2-1 && arr[startIdx] == 0)
        	startIdx++;
        for (int i=startIdx;i<len1+len2;i++) {
        	str.append(arr[i]);
        }
        return str.toString();
    
    }
}
