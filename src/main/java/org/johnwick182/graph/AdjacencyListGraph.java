package org.johnwick182.graph;

import java.util.*;

public class AdjacencyListGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    public AdjacencyListGraph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new LinkedList<>());
    }

    public void addEdge(int source, int destination) {
        //this part we call the map and add the s/d inside the list
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void removeEdge(int source, int destination) {
        adjacencyList.get(source).remove(destination);
        adjacencyList.get(destination).remove(source);
    }

    public void removeVertex(int vertex) {
        //remove it
        adjacencyList.remove(vertex);
        //remove the references
        for (List<Integer> neighbors : adjacencyList.values()) {
            neighbors.remove((Integer) vertex);
        }
    }

    public void DFS(int startVertex) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();

            System.out.println(currentVertex + " ");
            visited.add(currentVertex);

            for (int neighbor : adjacencyList.getOrDefault(currentVertex, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public void RecursiveDFS(int startVertex) {
        Set<Integer> visited = new HashSet<>();
        DFSRecursiveAux(startVertex, visited);
    }

    public void DFSRecursiveAux(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.println(vertex + " ");
        for (int neighbor : adjacencyList.getOrDefault(vertex, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                DFSRecursiveAux(neighbor, visited);
            }
        }
    }

    public void BFSIterative(int startVertex) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.println(currentVertex + " ");
            for (int neighor : adjacencyList.getOrDefault(currentVertex, Collections.emptyList())) {
                if (!visited.contains(neighor)) {
                    queue.add(neighor);
                    visited.add(neighor);
                }
            }
        }
    }


}
