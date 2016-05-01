package easy;

public class CountAndSay {
    public static String countAndSay(int n) {
        return countAndSay1(n);
    }
    
    public static String countAndSay1(int n) {
    	if (n<0) return "";
    	StringBuilder[] arr = new StringBuilder[n+1];
    	arr[0]= new StringBuilder();
    	arr[1]= new StringBuilder();
    	arr[1].append("1");
    	
    	char ch;
    	int count=0;
    	for (int i=2; i<=n; i++) {
    		arr[i] = new StringBuilder();
    		for (int j=0; j<arr[i-1].length(); j++) {
    			ch = arr[i-1].charAt(j);
    			count = 1;
    			while (j+1<arr[i-1].length()){
    				if (ch == arr[i-1].charAt(j+1)) {
    					count++;
    					j++;
    				} else {
    					break;
    				}
    			}
    			arr[i].append(Integer.toString(count)+ch);
    		}
    	}
        return arr[n].toString();
    }

}
