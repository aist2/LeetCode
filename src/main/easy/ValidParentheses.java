package easy;
import java.util.LinkedList;


public class ValidParentheses {
    public static boolean isValid(String s) {
        return isValid1(s);
    }
    
    public static boolean isValid1(String s) {
    	if (s.length() == 0) return true;
    	char[] arr = s.toCharArray();
    	LinkedList<Character> list = new LinkedList<Character>();
    	for (int i=0; i<s.length(); i++) {
    		if (arr[i] == '('||arr[i] == '['||arr[i] == '{') list.push(arr[i]);
    		if (arr[i] == ')') {
    			if (list.peek()!=null && list.peek() == '(') {
    				list.pop();
    			} else {
    				return false;
    			}
    		}
    		if (arr[i] == ']') {
    			if (list.peek()!=null && list.peek()=='[') {
    				list.pop();
    			} else {
    				return false;
    			}
    		}
    		if (arr[i] == '}') {
    			if (list.peek()!=null && list.peek() == '{') {
    				list.pop();
    			} else {
    				return false;
    			}
    		}
    	}
    	if (list.isEmpty()) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
