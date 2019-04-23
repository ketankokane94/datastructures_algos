public class driver {
    public static void main(String args[]) {
        Graph graph = new Graph();
        Vertex source = new Vertex("0");
        source.isSource = true;
        Vertex sink = new Vertex("5");
        sink.isSink = true;
        graph.addEdge(new Edge(source, new Vertex("1"), 16));
        graph.addEdge(new Edge(source, new Vertex("2"), 13));

        graph.addEdge(new Edge(new Vertex("1"), new Vertex("2"), 10));
        graph.addEdge(new Edge(new Vertex("1"), new Vertex("3"), 12));

        graph.addEdge(new Edge(new Vertex("2"), new Vertex("1"), 4));
        graph.addEdge(new Edge(new Vertex("2"), new Vertex("4"), 14));


        graph.addEdge(new Edge(new Vertex("3"), sink, 20));
        graph.addEdge(new Edge(new Vertex("3"), new Vertex("2"), 9));

        graph.addEdge(new Edge(new Vertex("4"), sink, 4));
        graph.addEdge(new Edge(new Vertex("4"), sink, 7));



        while (graph.getPathFrom(source,sink)){}
        int x = 0;
        for (int i = 0; i < graph.flows.size(); i++) {
            x += graph.flows.get(i);
        }
        System.out.println("Maximum flow= " + x);

    }
}
