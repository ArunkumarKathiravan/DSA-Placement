package dsa.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {
    public static List<Integer> traverse(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        List<Integer> order = new ArrayList<>();
        visit(graph, start, visited, order);
        return order;
    }

    private static void visit(List<List<Integer>> graph, int node,
                              boolean[] visited, List<Integer> order) {
        visited[node] = true;
        order.add(node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                visit(graph, neighbor, visited, order);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(0, 3), Arrays.asList(0, 3),
                Arrays.asList(1, 2));
        System.out.println(traverse(graph, 0));
    }
}
