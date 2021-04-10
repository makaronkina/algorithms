package lesson7;

import java.util.LinkedList;

public class Graph {
    private int vertexCount;
    private int edgeCount;
    private LinkedList<Integer>[] agjList;

    public Graph(int vertexCount) {
        if (vertexCount <= 0) {
            throw new IllegalArgumentException("Count of vertex must not be negative");
        }
        this.vertexCount = vertexCount;
        agjList = new LinkedList[vertexCount];
        for (int i = 0; i < agjList.length; i++) {
            agjList[i] = new LinkedList<>();
        }
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public LinkedList<Integer> getAgjList(int vertex) {
        return (LinkedList<Integer>) agjList[vertex].clone();
    }

    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= vertexCount || v2 >= vertexCount) {
            throw new IllegalArgumentException("Count of vertex or vertex must not be negative");
        }
        agjList[v1].add(v2);
        if (v1 == v2) {
            return;
        }
        agjList[v2].add(v1);
    }
}
