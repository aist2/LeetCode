package easy;

public class AddBinary {
	public static String addBinary(String a, String b) {
		return addBinary1(a, b);
	}

	public static String addBinary1(String a, String b) {
		if (b.equals(""))
			return a;
		if (a.equals(""))
			return b;
		int lenA = a.length();
		int lenB = b.length();
		int maxLen = Math.max(lenA, lenB);
		int intA;
		int intB;
		int val = 0;
		boolean carry = false;
		StringBuffer buff = new StringBuffer();
		
		for (int offset = 1; offset <= maxLen; offset++) {
			intA = (offset <= lenA) ? Character.getNumericValue(a.charAt(lenA
					- offset)) : 0;
			intB = (offset <= lenB) ? Character.getNumericValue(b.charAt(lenB
					- offset)) : 0;
			val = intA + intB;
			if (carry == true) {
				val += 1;
				carry = false;
			}
			if (val == 2) {
				val = 0;
				carry = true;
			} else if (val == 3) {
				val = 1;
				carry = true;
			}
			buff.append(Character.forDigit(val, 10));

		}
		
		if (carry == true) buff.append('1');
		
		return buff.reverse().toString();
	}

}
