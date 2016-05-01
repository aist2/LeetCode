package medium;

import java.util.Arrays;

import medium.CloneGraph;
import medium.UndirectedGraphNode;

import org.junit.Test;


public class CloneGraphTest {

	@Test
	public final void test() {
		UndirectedGraphNode n0 = new UndirectedGraphNode(0);
		UndirectedGraphNode n1 = new UndirectedGraphNode(1);
		UndirectedGraphNode n2 = new UndirectedGraphNode(2);
		n0.neighbors = Arrays.asList(n1,n2);
		n1.neighbors = Arrays.asList(n2);
		n2.neighbors = Arrays.asList(n2);
		UndirectedGraphNode actual = CloneGraph.cloneGraph(n0);
		System.out.println(actual);
	}

}
