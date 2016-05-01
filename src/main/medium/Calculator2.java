package medium;

public class Calculator2 {
	public static int calculate(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int res = 0;
		int sign = 1;
		int currVal = 0;
		int subRes = 1;
		char subSign = '*';
		char currChar;
		boolean inMulti = false;
		for (int i = 0; i < s.length(); i++) {
			currChar = s.charAt(i);
			if (currChar == ' ')
				continue;
			if (Character.isDigit(currChar))
				currVal = currVal * 10 + (currChar - '0');
			if (currChar == '+' || currChar == '-') {
				if (inMulti) {
					if (subSign == '*') {
						subRes *= currVal;
					} else {// subSign == '/'
						subRes /= currVal;
					}
					currVal = subRes;
					subSign = '*';
					subRes = 1;
					inMulti = false;
				}
				res += sign * currVal;
				currVal = 0;
				if (currChar == '+')
					sign = 1;
				else
					sign = -1;
			}
			if (currChar == '*' || currChar == '/') {
				inMulti = true;
				if (subSign == '*') {
					subRes *= currVal;
				} else {// subSign == '/'
					subRes /= currVal;
				}
				currVal = 0;
				subSign = currChar;
			}
		}
		if (inMulti) {
			if (subSign == '*') {
				subRes *= currVal;
			} else {// subSign == '/'
				subRes /= currVal;
			}
			currVal = subRes;
			subSign = '*';
			subRes = 1;
			inMulti = false;
		}
		res += sign * currVal;
		return res;
	}
}
