package medium;

public class WordDictionary {
	private WordNode root;
	WordDictionary() {
		root = new WordNode();
	}
    // Adds a word into the data structure.
    public void addWord(String word) {
        char[] charArray = word.toCharArray();
        WordNode node = root;
        for (char item: charArray) {
        	int idx = item-'a';
        	WordNode currNode = node.children[idx];
        	if (currNode==null) {
        		currNode = new WordNode();
        		node.children[idx] = currNode;
        	}
        	node = currNode;
        }
        node.isLeaf = true;
    	return;
    }
    
    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }
    
    private boolean searchHelper(String word, int pos, WordNode parent) {
    	if (pos==word.length())
    		return parent.isLeaf;
    	char currChar = word.charAt(pos);
    	if (currChar == '.') {
    		for (WordNode item: parent.children) 
    			if (item != null && searchHelper(word, pos+1, item))
					return true;
    		return false;
    	}
    	else {
    		int idx = currChar-'a';
    		return parent.children[idx] != null && searchHelper(word, pos+1, parent.children[idx]);
    	}
    }
}

class WordNode {
	boolean isLeaf = false;
	WordNode[] children = new WordNode[26];
}