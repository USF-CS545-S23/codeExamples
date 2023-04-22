package graphs;

import queues.ArrayQueue;
import queues.Queue;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
    private Edge[] graph; // adjacency list for this graph

    // Static nested class Edge
    public static class Edge { // Class Edge
        private int neighbor; // id of the neighbor (id of the destination node)
        private Edge next; // reference to the next "edge"

        public Edge(int neighbor) {
            this.neighbor = neighbor;
            next = null;
        }
    } // class Edge

    public Graph(int numVertices) {
        graph = new Edge[numVertices];
    }

    /**
     * Adds the given edge as an outgoing edge for the given vertex.
     * Modifies the adjacency list.
     *
     * @param vertexId id of the vertex
     * @param edge     outgoing edge
     *                 Do not modify.
     */
    public void addEdge(int vertexId, Edge edge) {
        Edge head = graph[vertexId]; // head of the linked list for this  node
        graph[vertexId] = edge; // insert in front
        if (head != null) {
            edge.next = head;
        }
    }

    public int getNumVertices() {
        return graph.length;
    }

    public void printNeighbors(int vertexId) {
        Edge current = graph[vertexId];
        // FILL IN CODE
        while (current != null) {
            System.out.println(current.neighbor);
            current = current.next;
        }
    }

    public boolean hasEdge(int i, int j) {
        Edge current = graph[i]; // the first outgoing edge for vertex i

        while(current != null) {
            if (current.neighbor == j)
                return true;
            current = current.next;
        }
        return false;
    }

    public ArrayList<Integer> incomingEdges(int i) {
        ArrayList<Integer>  incoming = new ArrayList<>();
        for (int j = 0; j < graph.length; j++) {
            if (j != i) {
                Edge current = graph[j];
                while (current != null) {
                    if (current.neighbor == i) {
                        incoming.add(j);
                    }
                    current = current.next;
                }
            }
        }
        return incoming;

    }

    /**
     * Runs dfs recursively from the given vertex
     * @param vertex source vertex
     * @param visited store true for each vertex i that has been visited, and false otherwise
     */
    void dfs(int vertex, boolean visited[]) {
        Edge tmp;
        visited[vertex] = true;
        System.out.println("Visited vertex " + vertex);
        // Iterate over edges of the vertex
        // Recursively call dfs on each neighbor that has not been visited yet
        for (tmp = graph[vertex]; tmp != null; tmp = tmp.next) {
            if (!visited[tmp.neighbor])
                dfs(tmp.neighbor, visited);
        }
    }

    /**
     * Itertive implementation of DFS using a stack
     * @param vertex source vertex
     * @param addedToStack
     */
    void dfsStack(int vertex, boolean addedToStack[]) {
        Edge tmp;
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);

        while (!stack.empty()) {
            int nextV = stack.pop();
            System.out.println("Visited vertex " + nextV);
            addedToStack[nextV] = true;
            tmp = graph[nextV];
            while (tmp != null) {
                if (!addedToStack[tmp.neighbor]) {
                    addedToStack[tmp.neighbor] = true;
                    stack.push(tmp.neighbor);
                }

                tmp = tmp.next;
            }
        }
    }

    /** Repeatedly runs dfs starting from each vertex that has not been visited
     */
    public void dfsMain() {
        boolean[] visited = new boolean[getNumVertices()];
        for (int i = 0; i < getNumVertices(); i++) {
            if (!visited[i]) {
                dfs(i, visited);
            }
        }
    }

    /**
     * Runs bfs starting from the given vertex.
     * @param vertex soure vertex
     * @param visited array that stores true for each vertex id that has been visited, and false otherwise
     */
    void bfs(int vertex, boolean visited[]) {
        Queue queue = new ArrayQueue(graph.length);
        visited[vertex] = true;
        System.out.println(" Visited vertex " + vertex);
        queue.enqueue(vertex);

        while (!queue.empty()) {
            int nextV = (int)queue.dequeue();
            Edge tmp = graph[nextV];
            while (tmp != null) {
                if (!visited[tmp.neighbor]) {
                    visited[tmp.neighbor] = true;
                    System.out.println(" Visited vertex " + tmp.neighbor);
                    queue.enqueue(tmp.neighbor);
                }
                tmp = tmp.next;
            }

        }

        // FILL IN CODE



    }

    public static void main(String[] args) {
        Graph g = new Graph(8);

        // edges going out of vertex 1
        Edge edge10 = new Edge(0);
        Edge edge12 = new Edge(2);
        g.addEdge(1, edge10);
        g.addEdge(1, edge12);

        // edge going out of 0
        Edge edge05 = new Edge(5);
        g.addEdge(0, edge05);

        //edge going out of 2
        Edge edge26 = new Edge(6);
        g.addEdge(2, edge26);

        // edges going out of 5
        Edge edge54 = new Edge(4);
        Edge edge56 = new Edge(6);
        g.addEdge(5, edge54);
        g.addEdge(5, edge56);

        // edge going out of 6
        Edge edge67 = new Edge(7);
        g.addEdge(6, edge67);

        //edge going out of 4
        Edge edge47 = new Edge(7);
        g.addEdge(4, edge47);

        // edge going out of 7
        Edge edge75 = new Edge(5);
        g.addEdge(7, edge75);

        System.out.println(g.hasEdge(0, 2)); // false
        System.out.println(g.incomingEdges(5)); // 0, 7

        boolean[] visited = new boolean[g.getNumVertices()];
        System.out.println("dfsStack starting with 0: ");
        g.dfsStack(0, visited); // 0, 5, 4, 7, 6

        System.out.println();
        visited = new boolean[g.getNumVertices()];
        System.out.println("Recursive dfs starting with 1: ");
        g.dfs(1, visited); // 1, 2, 6, 7, 5, 4, 0

        visited = new boolean[g.getNumVertices()];
        System.out.println();
        System.out.println("bfs starting with 1: ");
        g.bfs(1, visited); // 1, 2, 0, 6, 5, 7, 4
    }
}

