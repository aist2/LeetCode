package medium;
import static org.junit.Assert.*;

import org.junit.Test;

import medium.Trie;

public class TrieTest {

	@Test
	public void test() {
		Trie trie = new Trie();
		trie.insert("abcde");
		assertTrue(trie.search("abcde"));
	}

}
