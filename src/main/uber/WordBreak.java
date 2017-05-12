package uber;

import java.util.*;

/**
 * Created by ericli on 11/5/17.
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Set<Integer> failStart = new HashSet<>();
        return wordBreakUtil(s, wordSet, failStart, 0);
    }

    private static boolean wordBreakUtil(String s, Set<String> wordSet, Set<Integer> failStart, int start) {
        if (start == s.length()) {
            return true;
        }
        if (failStart.contains(start)) {
            return false;
        }
        for (int i=start+1; i<=s.length(); i++) {
            String str = s.substring(start, i);
            if (wordSet.contains(str)) {
                boolean res = wordBreakUtil(s, wordSet, failStart, i);
                if (res) {
                    return true;
                } else {
                    failStart.add(i);
                }
            }
        }
        failStart.add(start);
        return false;
    }

    public static List<String> wordBreak2(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Set<Integer> failStart = new HashSet<>();
        List<List<String>> sentenceList = new ArrayList<>();
        wordBreakUtil2(s, dict, failStart, 0, sentenceList, new ArrayList<>());
        List<String> sentences = new ArrayList<>();
        for (List<String> sentence: sentenceList) {
            sentences.add(String.join(" ", sentence));
        }
        return sentences;
    }

    private static boolean wordBreakUtil2(
        String s,
        Set<String> dict,
        Set<Integer> failStart,
        int start,
        List<List<String>> sentenceList,
        List<String> sentence
    ) {
        if (failStart.contains(start)) {
            return false;
        }
        boolean foundSentence = false;
        for (int i=start+1; i<=s.length(); i++) {
            String str = s.substring(start, i);
            if (dict.contains(str)) {
                sentence.add(str);
                if (i == s.length()) {
                    sentenceList.add(new ArrayList<>(sentence));
                    foundSentence = true;
                } else {
                    foundSentence = wordBreakUtil2(s,dict,failStart,i,sentenceList,sentence) || foundSentence;
                }
                sentence.remove(sentence.size()-1);
            }
        }
        if (!foundSentence) {
            failStart.add(start);
        }
        return foundSentence;
    }

    public static boolean wordBreakDP(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        for (int i=1; i<=s.length(); i++) {
            for (int j=0; j<i; j++) {
                String str = s.substring(j, i);
                if (res[j] && wordDict.contains(str)) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res[s.length()];
    }
}
