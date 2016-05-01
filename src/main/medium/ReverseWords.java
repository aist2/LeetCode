package medium;
public class ReverseWords {
	public static String reverseWords(String s) {
		if (s == null)
			return null;
		s = s.trim();
		if (s.length() == 0)
			return s;
		StringBuilder builder = new StringBuilder();
		int prevIdx=0;
		int currIdx=1;
		for (; currIdx < s.length(); currIdx++) {
			char curr = s.charAt(currIdx);
			if (curr == ' ') {
				if (prevIdx < currIdx)
					builder.insert(0, s.substring(prevIdx, currIdx+1));
				prevIdx = currIdx+1;
			}
		}
		if (prevIdx < currIdx)
			builder.insert(0, s.substring(prevIdx, currIdx) + ' ');
		builder.setLength(builder.length() - 1);
		return builder.toString();
	}
}
