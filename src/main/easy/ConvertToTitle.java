package easy;
public class ConvertToTitle {
	public static String convertToTitle(int n) {
		return convertToTitle1(n);
	}

	public static String convertToTitle1(int n) {
		StringBuilder str = new StringBuilder();
		while (n != 0) {
			n--;
			str.append((char) ('A' + (char)(n % 26)));
			n /= 26;
		} 
		return str.reverse().toString();
	}
}
