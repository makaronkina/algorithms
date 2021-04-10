package lesson7;

public class Solution {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(5, 6);
        graph.addEdge(0, 1);
        graph.addEdge(7, 8);
        graph.addEdge(7, 9);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 3);
        System.out.println(bfp.hasPathTo(2));
        System.out.println(bfp.pathTo(2));
    }
}
