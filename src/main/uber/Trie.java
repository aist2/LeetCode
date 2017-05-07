package uber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ericli on 6/5/17.
 */
public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode(null);
    }

    public void add(String word) {
        TrieNode node = root;
        for (char ch: word.toCharArray()) {
            if (node.map.containsKey(ch)) {
                node = node.map.get(ch);
            } else {
                TrieNode newNode = new TrieNode(ch);
                node.map.put(ch, newNode);
                node = newNode;
            }
        }
        node.isEnd = true;
    }

    public List<String> search(String prefix) {
        List<Character> word = new ArrayList<>();
        TrieNode node = root;
        for (char ch: prefix.toCharArray()) {
            if (node.map.containsKey(ch)) {
                node = node.map.get(ch);
                word.add(ch);
            } else {
                return null;
            }
        }
        word.remove(word.size()-1);
        List<String> words = new ArrayList<>();
        traverse(node, word, words);
        return words;
    }

    private void traverse(TrieNode root, List<Character> word, List<String> words) {
        word.add(root.val);
        if (root.isEnd) {
            words.add(word.stream().map(e->e.toString()).collect(Collectors.joining()));
        }
        for (TrieNode node: root.map.values()) {
            traverse(node, word, words);
        }
        word.remove(word.size()-1);
    }
}
