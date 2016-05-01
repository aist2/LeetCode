package easy;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static int romanToInt(String s) {
		return romanToInt1(s);
	}

	public static int romanToInt1(String s) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XL", 40);
		map.put("L", 50);
		map.put("XC", 90);
		map.put("C", 100);
		map.put("CD", 400);
		map.put("D", 500);
		map.put("CM", 900);
		map.put("M", 1000);
		String currRoman;
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length()) {
				currRoman = s.substring(i, i + 2);
				if (map.containsKey(currRoman)) {
					res += map.get(currRoman);
					i++;
					continue;
				}
			}
			currRoman = s.substring(i, i + 1);
			if (map.containsKey(currRoman)) {
				res += map.get(currRoman);
				continue;
			} else {
				return 0;
			}
		}
		return res;
	}
}
