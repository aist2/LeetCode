package easy;
public class StrStr {
	public static int strStr(String haystack, String needle) {
		return strStr2(haystack, needle);
	}
	public static int strStr1(String haystack, String needle) {
		int pH = 0;
		int pN = 0;
		if (needle.length() == 0)
			return 0;
		while (pH < haystack.length()) {
			if (haystack.charAt(pH) == needle.charAt(pN)) {
				while (pN < needle.length()) {
					if (pH + pN >= haystack.length())
						return -1;
					if (haystack.charAt(pH + pN) == needle.charAt(pN)) {
						pN++;
					} else {
						pN = 0;
						break;
					}
				}
				if (pN == needle.length())
					return pH;
			}
			pH++;
		}
		return -1;
	}
	public static int strStr2(String haystack, String needle) {
		int lenN = needle.length();
		if (lenN==0) return 0;
		for (int i=0; i<haystack.length()-lenN+1; i++){
			if (haystack.substring(i, i+lenN).equals(needle)) return i;
		}
		return -1;
	}
}
