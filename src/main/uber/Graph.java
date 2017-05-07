package uber;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by ericli on 7/5/17.
 */
public class Graph {
    private List<Integer>[] adj;
    private int size;

    public Graph(int size) {
        this.size = size;
        adj = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void dfsRecur(int v) {
        boolean[] visited = new boolean[size];
        dfsHelper(v, visited);
    }

    private void dfsHelper(int v, boolean[] visited) {
        System.out.println(v);
        visited[v] = true;
        List<Integer> edges = adj[v];
        for (int u: edges) {
            if (!visited[u]) {
                dfsHelper(u, visited);
            }
        }
    }

    public void dfsIter(int v) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[size];
        stack.push(v);
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            visited[vertex] = true;
            System.out.println(vertex);
            List<Integer> edges = adj[vertex];
            for (int u: edges) {
                if (!visited[u]) {
                    stack.push(u);
                    continue;
                }
            }

        }
    }

    public void bfsIter(int v) {
        boolean[] visited = new boolean[size];
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        while (!q.isEmpty()) {
            int vertex = q.poll();
            visited[vertex] = true;
            System.out.println(vertex);
            List<Integer> edges = adj[vertex];
            for (int u: edges) {
                if (!visited[u]) {
                    q.offer(u);
                }
            }

        }
    }

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            topologicalSortHelper(i, stack, visited);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        return;
    }

    private void topologicalSortHelper(int v, Stack<Integer> stack, boolean[] visited) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        List<Integer> edges = adj[v];
        for (int u: edges) {
            if (!visited[u]) {
                topologicalSortHelper(u, stack, visited);
            }
        }
        stack.push(v);
    }
}
