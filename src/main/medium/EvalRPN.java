package medium;
import java.util.Deque;
import java.util.LinkedList;

public class EvalRPN {
	public static int evalRPN(String[] tokens) {
		if (tokens==null||tokens.length == 0) return 0;
		Deque<Integer> stack = new LinkedList<>();
		int val1=0, val2=0, res=0;
		for (String item : tokens) {
			if (item.equals("+") || item.equals("-") || item.equals("*")
					|| item.equals("/")) {
				val1 = stack.pop();
				val2 = stack.pop();
				switch (item) {
				case "+":
					res = val1+val2;
					break;
				case "-":
					res = val2 - val1;
					break;
				case "*":
					res = val1*val2;
					break;
				case "/":
					res = val2/val1;
					break;
				}
				stack.push(res);
			} else {
				stack.push(Integer.valueOf(item));
			}
		}
		return stack.pop();
	}
}
