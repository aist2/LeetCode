package medium;
import static org.junit.Assert.*;
import medium.WordDictionary;

import org.junit.Test;


public class WordDictionaryTest {

	@Test
	public final void test() {
		 WordDictionary wordDictionary = new WordDictionary();
		 wordDictionary.addWord("bad");
		 wordDictionary.addWord("dad");
		 wordDictionary.addWord("mad");
		 assertFalse(wordDictionary.search("pad"));
		 assertTrue(wordDictionary.search("bad"));
		 assertTrue(wordDictionary.search(".ad"));
		 assertTrue(wordDictionary.search("b.."));
		 assertFalse(wordDictionary.search("b.da"));
		 assertFalse(wordDictionary.search("a"));
	}

}
