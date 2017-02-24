public class TopologicaSorterTester{

  public static void main(String args[])
    {
        // Create a graph given in the above diagram
        Graph g = new Graph(8);
        g.addEdge(0, 3);
        g.addEdge(3, 5);
        g.addEdge(5, 7);
        g.addEdge(7, 4);
        g.addEdge(4, 2);
        g.addEdge(2, 1);
        g.addEdge(1, 6);
 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        g.topologicalSort();
    }

}