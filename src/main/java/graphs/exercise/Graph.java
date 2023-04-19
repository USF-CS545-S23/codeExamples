package graphs.exercise;

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
     * Return the number of vertices in the graph
     * @return number of vertices
     */
    public int getNumVertices() {
        return graph.length;
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

    /**
     * Implements Depth fist search recursively
     * @param vertex source vertex
     * @param visited array that stores true for every vertex that has been visited,
     *                and false otherwise
     */
    public void dfs(int vertex, boolean visited[]) {
        // Uses the graph adjacency list
        // private Edge[] graph;
        Edge tmp;
        visited[vertex] = true;
        // Iterate over edges of the vertex
        // Recursively call dfs on each neighbor that has not been visited yet
        // FILL IN CODE

    }

    /**
     * Implements Depth first search iteratively
     * @param vertex source vertex
     * @param addedToStack array that stores true for every vertex that has been visited,
     *                and false otherwise
     */
    void dfsStack(int vertex, boolean addedToStack[]) {
        // Uses the graph adjacency list
        // private Edge[] graph;
        Edge tmp;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(vertex);
        addedToStack[vertex] = true;

        while (!stack.empty()) {
            int nextV = stack.pop();
            System.out.println("Visited vertex " + nextV);
            // FILL IN CODE: iterate over outgoing edges,
            // and push each neighbor onto the stack if it has not been added yet;
            // mark it as true in the addedToStack array


        }
    }

    /**
     * Implements Bread First Search
     * @param vertex source vertex
     * @param visited stores true for each vertex that has been visited
     */
    void bfs(int vertex, boolean visited[]) {
        // Uses the graph adjacency list
        // private Edge[] graph;
        Queue queue = new ArrayQueue(graph.length);
        visited[vertex] = true;

        queue.enqueue(vertex);
        while (!queue.empty()) {
            int nextV = (int)queue.dequeue();
            Edge tmp = graph[nextV];
            // FILL IN CODE
        }
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

        boolean[] visited = new boolean[g.getNumVertices()]; // initially all false
        g.dfs(0, visited);

        // visited = new boolean[g.getNumVertices()]; // reset the visited array
        // g.bfs(0, visited);
    }
}

