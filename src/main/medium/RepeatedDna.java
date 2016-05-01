package medium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDna {
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> words = new HashSet<>();
        Set<String> repeatedWords = new HashSet<>();
        for (int i=0; i<s.length()-9; i++) {
        	String curr = s.substring(i, i+10);
        	if (!words.add(curr))
        		repeatedWords.add(curr);
        }
        return new ArrayList<String>(repeatedWords);
    }
}
