package medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
    	if (numCourses < 2 || prerequisites == null || prerequisites.length==0) return true;
    	int[] outdegree = new int[numCourses];
    	@SuppressWarnings("unchecked")
		List<Integer>[] graph = new List[numCourses];
    	
    	for (int i=0; i<numCourses; i++) {
    		graph[i] = new ArrayList<Integer>();
    	}
    	
    	for (int i=0; i<prerequisites.length; i++) {
    		graph[prerequisites[i][0]].add(prerequisites[i][1]);
    		outdegree[prerequisites[i][1]]++;
    	}
    	
    	Deque<Integer> queue = new LinkedList<>();
    	int count = 0;
    	for (int i=0; i<numCourses; i++) {
    		if (outdegree[i]==0) {
    			queue.offer(i);
    			count++;
    		}
    	}
    	
    	while (!queue.isEmpty()) {
    		int vertex = queue.poll();
    		for (int i=0; i<graph[vertex].size(); i++) {
    			int pre = graph[vertex].get(i);
    			if (--outdegree[pre] == 0) {
    				queue.offer(pre);
    				count++;
    			}
    		}
    	}
    	return count==numCourses;
    }
	
    public static boolean canFinish1(int numCourses, int[][] prerequisites) {
    	if (numCourses < 2 || prerequisites == null || prerequisites.length==0) return true;
    	boolean[] visited = new boolean[numCourses];
    	@SuppressWarnings("unchecked")
		List<Integer>[] graph = new List[numCourses];
    	
    	for (int i=0; i<numCourses; i++) {
    		graph[i] = new ArrayList<Integer>();
    	}
    	
    	for (int i=0; i<prerequisites.length; i++) {
    		graph[prerequisites[i][1]].add(prerequisites[i][0]);
    	}
    	
    	for (int i=0; i<numCourses; i++) {
    		if (!dfs(graph, i, visited))
    			return false;
    	}
    	return true;
    }
    
    private static boolean dfs(List<Integer>[] graph, int vertex, boolean[] visited) {
    	if (visited[vertex])
    		return false;
    	visited[vertex] = true;
    	for (int i=0; i<graph[vertex].size(); i++) {
    		if (!dfs(graph, graph[vertex].get(i), visited))
    			return false;
    	}
    	visited[vertex] = false;
    	return true;
    }
}