package medium;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiffWaysToCompute {
	public static List<Integer> diffWaysToCompute(String input) {
		Map<String, List<Integer>> map = new HashMap<>();
		return helper(input, map);
	}

	private static List<Integer> helper(String input,
			Map<String, List<Integer>> map) {
		if (map.containsKey(input))
			return map.get(input);
		List<Integer> res = new ArrayList<>();
		int val = 0;
		for (int i = 0; i < input.length(); i++) {
			char currChar = input.charAt(i);
			if (currChar == '+' || currChar == '-' || currChar == '*') {
				String leftStr = input.substring(0, i);
				String rightStr = input.substring(i + 1, input.length());
				List<Integer> leftRes = helper(leftStr, map);
				List<Integer> rightRes = helper(rightStr, map);
				for (int leftInt : leftRes) {
					for (int rightInt : rightRes) {
						switch (currChar) {
						case '+':
							val = leftInt + rightInt;
							break;
						case '-':
							val = leftInt - rightInt;
							break;
						case '*':
							val = leftInt * rightInt;
							break;
						}
						res.add(val);
					}
				}
			}
		}
		if (res.isEmpty()) {
			res.add(Integer.valueOf(input));
		}
		map.put(input, res);
		return res;
	}
}
