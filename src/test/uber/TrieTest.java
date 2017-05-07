package uber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ericli on 6/5/17.
 */
public class TrieTest {
    @Test
    public void search() throws Exception {
        Trie trie = new Trie();
        trie.add("abc");
        trie.add("abd");
        trie.add("acb");
        System.out.println(trie.search("ab"));
    }

}