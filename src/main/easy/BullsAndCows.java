package easy;

import java.util.HashMap;
import java.util.Map;


public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        return getHint2(secret, guess);
    }
    
    public static String getHint1(String secret, String guess) {
    	int tmpInt;
    	int bullCount = 0;
    	int cowCount = 0;
    	Map<Character,Integer> map = new HashMap<Character,Integer>();
    	for (int i=0; i<secret.length(); i++){
    		if (secret.charAt(i) == guess.charAt(i)){
    			bullCount++;
    		}
    		else {
    			tmpInt = map.getOrDefault(secret.charAt(i), 0);
    			if (tmpInt<0){
    				cowCount+=1;
    			}
    			map.put(secret.charAt(i), tmpInt+1);
    			
    			tmpInt = map.getOrDefault(guess.charAt(i), 0);
    			if (tmpInt>0){
    				cowCount+=1;
    			}
    			map.put(guess.charAt(i), tmpInt-1);
    		}
    	}
        return Integer.toString(bullCount)+"A"+Integer.toString(cowCount)+"B";
    }
    
    public static String getHint2(String secret, String guess) {
    	int tmpInt = 0;
    	int bullCount = 0;
    	int cowCount = 0;
    	int[] map = new int[10];
    	for (int i=0; i<secret.length(); i++){
    		if (secret.charAt(i) == guess.charAt(i)){
    			bullCount++;
    		}
    		else {
    			tmpInt = Character.getNumericValue(secret.charAt(i));
    			if (map[tmpInt]<0){
    				cowCount+=1;
    			}
    			map[tmpInt]+=1;
    			
    			tmpInt = Character.getNumericValue(guess.charAt(i));
    			if (map[tmpInt]>0){
    				cowCount+=1;
    			}
    			map[tmpInt]-=1;
    		}
    	}
        return Integer.toString(bullCount)+"A"+Integer.toString(cowCount)+"B";
    }
}
