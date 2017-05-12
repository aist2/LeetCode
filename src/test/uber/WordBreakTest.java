package uber;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ericli on 11/5/17.
 */
public class WordBreakTest {
    @Test
    public void wordBreak() throws Exception {
        List<String> wordDict = Arrays.asList("leet", "code");
        assertTrue(WordBreak.wordBreak("leetcode", wordDict));
    }

    @Test
    public void wordBreak2() throws Exception {
        List<String> wordDict = Arrays.asList("a");
        assertFalse(WordBreak.wordBreak("aaaaaab", wordDict));
    }

    @Test
    public void wordBreak3() throws Exception {
        List<String> wordDict = Arrays.asList("aaaa","aaa");
        assertTrue(WordBreak.wordBreak("aaaaaaa", wordDict));
    }

    @Test
    public void wordBreakSentence() {
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> res = WordBreak.wordBreak2("catsanddog", wordDict);
        List<String> expected = Arrays.asList("cat sand dog", "cats and dog");
        assertThat(res, is(expected));
    }

    @Test
    public void wordBreakSentence2() {
        List<String> wordDict = Arrays.asList("a");
        WordBreak.wordBreak2("aaaaaab", wordDict);
    }

    @Test
    public void wordBreakDP() throws Exception {
        List<String> wordDict = Arrays.asList("leet", "code");
        assertTrue(WordBreak.wordBreakDP("leetcode", wordDict));
    }
}