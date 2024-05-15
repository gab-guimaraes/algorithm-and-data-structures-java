package org.johnwick182.graph;

public class Graph {
    //vertex - vertice (bolas)
    //edge - linhas (conections)
    int[][] adjMatrix;

    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public void addVertex() {
        int[][] newAdjMatrix = new int[numVertices++][numVertices++];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                newAdjMatrix[i][j] = adjMatrix[i][j];
            }
        }
        adjMatrix = newAdjMatrix;
        this.numVertices++;
    }

    public void removeVertex(int value) {
        int[][] newAdjMatrix = new int[numVertices--][numVertices--];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (i != value && j != value)
                    newAdjMatrix[i][j] = adjMatrix[i][j];
            }
        }
        adjMatrix = newAdjMatrix;
        this.numVertices--;
    }
}
