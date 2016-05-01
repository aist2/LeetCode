package easy;
import java.util.Arrays;

public class ClimbStairs {
    public int climbStairs(int n) {
    	
    	int[] stepArr = new int[n+1];
    	Arrays.fill(stepArr, 0);
    	stepArr[0]=1;
    	int currStep = 0;
    	while(currStep<=n){
    		//n = (n-1) + 1
    		if (currStep+1 <=n) stepArr[currStep+1] += stepArr[currStep];
    		//n = (n-2) + 2
    		if (currStep+2 <=n) stepArr[currStep+2] += stepArr[currStep];
    		currStep++;
    	}
        return stepArr[n];
    }
    
}
