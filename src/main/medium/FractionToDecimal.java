package medium;
import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {
	public static String fractionToDecimal(int numerator, int denominator) {
		if (denominator==0) return "";
		if (numerator==0) return "0";
		StringBuilder str = new StringBuilder();
		
		long remainder = numerator;
		long denom = denominator;

		if (remainder < 0 ^ denom < 0)
			str.append("-");
		remainder = Math.abs(remainder);
		denom = Math.abs(denom);
		str.append(remainder / denom);
		remainder %= denom;
		if (remainder == 0)
			return str.toString();
		str.append(".");
		Map<Long,Integer> map = new HashMap<>();
		while (remainder != 0) {
			if (map.containsKey(remainder)) {
				str.insert(map.get(remainder), "(");
				str.append(")");
				break;
			}
			map.put(remainder, str.length());
			remainder *= 10;
			str.append(remainder / denom);
			remainder %= denom;
		}
		return str.toString();
	}
}
