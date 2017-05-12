package uber;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by ericli on 8/5/17.
 */
public class CourseSchedule {
    public int[] findOrderDFS(int numCourses, int[][] prerequisites) {
        CourseGraph g = new CourseGraph(numCourses);
        for (int[] relation: prerequisites) {
            g.addEdge(relation[1], relation[0]);
        }
        return g.topologicalSortDFS();
    }

    public int[] findOrderBFS(int numCourses, int[][] prerequisites) {
        CourseGraph g = new CourseGraph(numCourses);
        for (int[] relation: prerequisites) {
            g.addEdge(relation[1], relation[0]);
        }
        return g.topologicalSortBFS();
    }

    private class CourseGraph {
        int size;
        List<Integer>[] edges;
        int[] inCount;
        public CourseGraph(int size) {
            this.size = size;
            edges = new LinkedList[size];
            inCount = new int[size];
            for (int i=0; i<size; i++) {
                edges[i] = new LinkedList<>();
            }
        }

        public void addEdge(int u, int v) {
            edges[u].add(v);
            inCount[v]++;
        }

        public int[] topologicalSortBFS() {
            Queue<Integer> q = new LinkedList<>();
            int[] order = new int[size];
            int visited = 0;
            for (int i=0; i<size; i++) {
                if (inCount[i]==0) {
                    q.offer(i);
                }
            }
            while (!q.isEmpty()) {
                int v = q.poll();
                order[visited++] = v;
                List<Integer> edge = edges[v];
                for (int u: edge) {
                    inCount[u]--;
                    if (inCount[u] == 0) {
                        q.offer(u);
                    }
                }
            }
            if (visited == size) {
                return order;
            } else {
                return null;
            }
        }

        public int[] topologicalSortDFS() {
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[size];
            for (int i=0; i<size; i++) {
                topologicalSortHelper(i, stack, visited);
            }
            int[] res = new int[size];
            for (int i=0; i<size; i++) {
                res[i] = stack.pop();
            }
            return res;
        }

        private void topologicalSortHelper(int u, Stack<Integer> stack, boolean[] visited) {
            if (visited[u]) {
                return;
            }
            visited[u] = true;
            List<Integer> nodes = edges[u];
            for (int v: nodes) {
                topologicalSortHelper(v, stack, visited);
            }
            stack.add(u);
        }

    }
}
