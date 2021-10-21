import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_BFS {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph_BFS(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[v];

        Queue<Integer> queue = new LinkedList();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.remove();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {

                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


    public static void main(String[] args) {

        Graph_BFS g = new Graph_BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.BFS(2);

    }

}
