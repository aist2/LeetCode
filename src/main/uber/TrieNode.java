package uber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ericli on 6/5/17.
 */
public class TrieNode {
    Character val;
    Map<Character,TrieNode> map;
    boolean isEnd;

    public TrieNode(Character val) {
        map = new HashMap<>();
        isEnd = false;
        this.val = val;
    }
}
