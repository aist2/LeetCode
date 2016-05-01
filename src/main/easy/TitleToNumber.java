package easy;
public class TitleToNumber {
	public static int titleToNumber(String s) {
		return titleToNumber1(s);
	}

	public static int titleToNumber1(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			res *= 26;
			res += s.charAt(i) - 'A' + 1;
		}
		return res;
	}
}
