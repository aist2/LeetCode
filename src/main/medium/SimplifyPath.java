package medium;
import java.util.LinkedList;
import java.util.List;

public class SimplifyPath {
	public static String simplifyPath(String path) {
		int idx = 0;
		int len = path.length();
		List<String> res = new LinkedList<>();
		if (path.charAt(0) == '/')
			idx++;
		while (idx < len) {
			// read till '/'
			StringBuilder builder = new StringBuilder();
			while (idx < len && path.charAt(idx) != '/') {
				builder.append(path.charAt(idx++));
			}
			idx++;
			if (builder.length() == 0)
				continue;
			String str = builder.toString();
			if (str.equals("."))
				continue;
			else if (str.equals("..")){
				if (res.isEmpty())
					continue;
				else
					res.remove(res.size()-1);
			}
			else {
				builder.insert(0, '/');
				res.add(builder.toString());
			}
		}
		if (res.isEmpty())
			return "/";
		StringBuilder builder = new StringBuilder();
		for (String str : res)
			builder.append(str);
		return builder.toString();
	}
}
