package medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule2 {
	int N;
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		N = numCourses - 1;
		DirectedGraphNode[] graph = new DirectedGraphNode[numCourses];
		int[] order = new int[numCourses];
		
		for (int i=0; i<numCourses; i++) {
			graph[i] = new DirectedGraphNode(i);
		}
		for (int i=0; i<prerequisites.length; i++) {
			graph[prerequisites[i][1]].neighbors.add(graph[prerequisites[i][0]]);
		}
		for (int i=0; i<numCourses; i++) {
			if (!dfs(graph[i],order))
				return new int[] {};
		}
		return order;
	}

	private boolean dfs(DirectedGraphNode node, int[] order) {
		if (node.tested)
			return false;
		if (node.visited)
			return true;
		node.visited = true;
		node.tested = true;
		for (int i=0; i<node.neighbors.size(); i++) {
			if (!dfs(node.neighbors.get(i),order))
				return false;
		}
		order[N] = node.label;
		N--;
		node.tested = false;
		return true;
	}
	
	public int[] findOrder1(int numCourses, int[][] prerequisites) {
		int[] outdegree = new int[numCourses];
		List<Integer> order = new LinkedList<>();
		@SuppressWarnings("unchecked")
		List<Integer>[] graph = new List[numCourses];

		for (int i = 0; i < numCourses; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < prerequisites.length; i++) {
			graph[prerequisites[i][0]].add(prerequisites[i][1]);
			outdegree[prerequisites[i][1]]++;
		}

		Deque<Integer> queue = new LinkedList<>();
		int count = 0;
		for (int i = 0; i < numCourses; i++) {
			if (outdegree[i] == 0) {
				queue.offer(i);
				order.add(0, i);
				count++;
			}
		}

		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			for (int i = 0; i < graph[vertex].size(); i++) {
				int pre = graph[vertex].get(i);
				if (--outdegree[pre] == 0) {
					queue.offer(pre);
					order.add(0, pre);
					count++;
				}
			}
		}
		if (count != numCourses) {
			return new int[] {};
		}
		int[] res = new int[numCourses];
		for (int i = 0; i < order.size(); i++) {
			res[i] = order.get(i);
		}
		return res;
	}
}

class DirectedGraphNode {
	int label;
	List<DirectedGraphNode> neighbors = new ArrayList<DirectedGraphNode>();
	boolean visited = false;
	boolean tested = false;
	DirectedGraphNode(int x) {
		label = x;
	}
};