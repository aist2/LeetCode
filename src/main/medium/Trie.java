package medium;
public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        char[] charArr = word.toCharArray();
        TrieNode curr = root;
        for (char item: charArr) {
        	int i = item-'a';
        	if (curr.children[i] == null)
        		curr.children[i] = new TrieNode(item);
        	curr = curr.children[i];
        }
        curr.isLeaf = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
    	char[] charArr = word.toCharArray();
    	TrieNode curr = root;
    	for (char item: charArr) {
    		int i = item-'a';
    		curr = curr.children[i];
    		if (curr==null)
    			return false;
    	}
    	if (curr.isLeaf)
    		return true;
    	else
    		return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
    	char[] charArr = prefix.toCharArray();
    	TrieNode curr = root;
    	for (char item: charArr) {
    		int i = item-'a';
    		curr = curr.children[i];
    		if (curr==null)
    			return false;
    	}
    	return true;
    }
}

class TrieNode {
	TrieNode[] children = new TrieNode[26];
	boolean isLeaf = false;
	char val = ' ';
	public TrieNode() {
    }
	public TrieNode(char x) {
        val = x;
    }
}
