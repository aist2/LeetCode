package medium;
import java.util.Deque;
import java.util.LinkedList;


public class Calculate {
    public static int calculate(String s) {
        if (s==null||s.length()==0) return 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        int res = 0;
        int currVal = 0;
        int sign = 1;
        char currChar;
        for (int i=0; i<s.length(); i++) {
        	currChar = s.charAt(i);
        	if (Character.isDigit(currChar))
        		currVal = currVal*10 + (currChar - '0');
        	else if (currChar == ' ')
    			continue;
        	else if (currChar == '+') {
        		res += sign*currVal;
        		currVal = 0;
        		sign = 1;
        	}
        	else if (currChar == '-') {
        		res += sign*currVal;
        		currVal = 0;
        		sign = -1;
        	}
        	else if (currChar == '(') {
        		stack.push(res);
        		stack.push(sign);
        		res = 0;
        		currVal = 0;
        		sign = 1;
        	}
        	else if (currChar == ')') {
        		res += sign*currVal;
        		res *= stack.pop();
        		res += stack.pop();
        		currVal = 0;
        	}
        }
        if (currVal > 0)
        	res += sign * currVal;
        return res;
    }
	
    public static int calculate1(String s) {
        if (s==null||s.length()==0) return 0;
        Deque<Integer> idxList = new LinkedList<Integer>();
        return helper(s,0,idxList);
    }
    
    private static int helper(String s, int idx, Deque<Integer>idxList) {
    	StringBuilder str = new StringBuilder();
    	boolean isPlus = true;
    	int res = 0;
    	while (idx < s.length()) {
    		char currChar = s.charAt(idx++);
    		if (Character.isDigit(currChar)) {
    			str.append(currChar);
    			continue;
    		}
    		else if (currChar == ' ')
    			continue;
    		else {
    			int currVal = 0;
    			if (currChar == '(') {
    				currVal = helper(s,idx,idxList);
    				idx = idxList.pop();
    			}
    			else if (str.length() >0 ){ // '+', '-', ')'
					currVal = Integer.valueOf(str.toString());
    				str = new StringBuilder();
    			}
    			if (isPlus)
    				res += currVal;
    			else //is minus
    				res -= currVal;
    			if (currChar == '-')
    				isPlus = false;
    			else if (currChar == '+')
    				isPlus = true;
    			else if (currChar == ')'){
    				idxList.push(idx);
    				return res;
    			}
    		}
    	}
    	if (str.length() > 0) {
    		if (isPlus)
				res += Integer.valueOf(str.toString());
			else //is minus
				res -= Integer.valueOf(str.toString());
    	}
    	return res;
    }
}
