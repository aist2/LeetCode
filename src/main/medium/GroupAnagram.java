package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static List<List<String>> groupAnagrams(String[] strs) {
		Arrays.sort(strs);
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String sortedStr = String.valueOf(arr);
			List<String> list = map.get(sortedStr);
			if (list == null) {
				list = new ArrayList<>();
				list.add(str);
				map.put(sortedStr, list);
			} else {
				list.add(str);
			}
		}
		for (List<String> list:map.values()){
			Collections.sort(list);
		}
		return new ArrayList<List<String>>(map.values());
	}
}
