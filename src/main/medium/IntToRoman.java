package medium;

public class IntToRoman {
    public static String intToRoman(int num) {
    	//M:1000,D:500,C:100,L:50,X:10,V:5,I:1
    	int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    	String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    	StringBuilder builder = new StringBuilder();
    	for (int i=0; i<nums.length; i++) {
    		while (num >= nums[i]) {
    			builder.append(strs[i]);
    			num -= nums[i];
    		}
    	}
        return builder.toString();
    }
}
