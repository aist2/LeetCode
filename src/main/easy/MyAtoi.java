package easy;
public class MyAtoi {

	public static int myAtoi(String str) {
		return myAtoi3(str);
	}

	public static int myAtoi1(String str) {
		double MAX = 2147483647;
		double MIN = -2147483648;
		str = str.trim();
		if (str.equals(""))
			return 0;
		StringBuilder buff = new StringBuilder();
		int sign = 1;
		double doubleRes = 0.0;
		int intRes = 0;
		char currChar;
		boolean isInSequence = false;

		int i = 0;
		while (i < str.length()) {
			currChar = str.charAt(i++);
			if (isInSequence) {
				if (!Character.isDigit(currChar)) {
					break;
				} else {
					buff.append(Character.getNumericValue(currChar));
				}

			} else {
				if (currChar == '+') {
					sign = 1;
					isInSequence = true;
				} else if (currChar == '-') {
					sign = -1;
					isInSequence = true;
				} else if (Character.isDigit(currChar)) {
					buff.append(Character.getNumericValue(currChar));
					isInSequence = true;
				} else {
					break;
				}
			}
		}
		if (buff.length() == 0)
			return 0;
		doubleRes = Double.valueOf(buff.toString());
		doubleRes *= sign;

		if (doubleRes > MAX) {
			intRes = Double.valueOf(MAX).intValue();
		} else if (doubleRes < MIN) {
			intRes = Double.valueOf(MIN).intValue();
		} else {
			intRes = Double.valueOf(doubleRes).intValue();
		}
		return intRes;
	}

	public static int myAtoi2(String str) {
		str = str.trim();
		if (str.equals(""))
			return 0;

		int sign = 1;
		int i = 0;
		int res = 0;
		char currChar = str.charAt(i);
		int currInt;
		if (currChar == '+') {
			sign = 1;
			i++;
		} else if (currChar == '-') {
			sign = -1;
			i++;
		} else if (!Character.isDigit(currChar)) {
			return 0;
		}

		while (i < str.length()) {
			currChar = str.charAt(i++);
			if (!Character.isDigit(currChar))
				break;
			currInt = Character.getNumericValue(currChar);
			if (sign == 1) {
				if (res > Integer.MAX_VALUE / 10
						|| (res == Integer.MAX_VALUE / 10 && currInt > Integer.MAX_VALUE % 10))
					return Integer.MAX_VALUE;
			}
			if (sign == -1) {
				if (res > Integer.MIN_VALUE / 10 * -1
						|| (res == Integer.MIN_VALUE / 10 * -1 && currInt > Integer.MIN_VALUE
								% 10 * -1))
					return Integer.MIN_VALUE;
			}
			res = res * 10 + currInt;
		}
		return res * sign;
	}

	public static int myAtoi3(String str) {
		int index = 0, sign = 1, total = 0;
		// 1. Empty string
		if (str.length() == 0)
			return 0;

		// 2. Remove Spaces
		while (str.charAt(index) == ' ' && index < str.length())
			index++;

		// 3. Handle signs
		if (str.charAt(index) == '+' || str.charAt(index) == '-') {
			sign = str.charAt(index) == '+' ? 1 : -1;
			index++;
		}

		// 4. Convert number and avoid overflow
		while (index < str.length()) {
			int digit = str.charAt(index) - '0';
			if (digit < 0 || digit > 9)
				break;

			// check if total will be overflow after 10 times and add digit
			if (Integer.MAX_VALUE / 10 < total
					|| Integer.MAX_VALUE / 10 == total
					&& Integer.MAX_VALUE % 10 < digit)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			total = 10 * total + digit;
			index++;
		}
		return total * sign;
	}
}
