package lesson7;

public class DepthFirstPath extends FirstPath{

    public DepthFirstPath(Graph g, int source) {
        super(g, source);
        dfs(g, source);
    }

    public void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAgjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }
}
