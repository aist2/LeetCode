package medium;
import java.util.HashMap;
import java.util.Map;


public class CloneGraph {
    public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer,UndirectedGraphNode> map = new HashMap<>();
        return helper(node, map);
    }
    
    private static UndirectedGraphNode helper(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> map) {
    	if (node==null) return null;
    	UndirectedGraphNode newNode = null;
    	if (map.containsKey(node.label)) {
    		newNode = map.get(node.label);
    		return newNode;
    	}
    	else {
    		newNode = new UndirectedGraphNode(node.label);
    		map.put(node.label, newNode);
    	}
    	
        for (UndirectedGraphNode item: node.neighbors) {
        	UndirectedGraphNode newItem = null;
        	if (item==node)
        		newItem = newNode;
        	else
        		newItem = helper(item, map);
        	newNode.neighbors.add(newItem);
        }
        return newNode;
    }
}
