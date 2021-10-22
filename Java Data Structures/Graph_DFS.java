import java.util.LinkedList;

public class Graph_DFS {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph_DFS(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for(int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }

//        Iterator<Integer> i = adj[v].listIterator();
//        while (i.hasNext()) {
//            int n = i.next();
//            if (!visited[n]) {
//                DFSUtil(n, visited);
//            }
//        }

    }

    public void DFS() {
        boolean visited[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i])
                DFSUtil(i, visited);
        }
    }


    public static void main(String[] args) {

        Graph_DFS g = new Graph_DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal");

        g.DFS();

    }

}
