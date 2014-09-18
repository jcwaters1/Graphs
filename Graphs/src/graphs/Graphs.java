
package graphs;

import java.util.ArrayList;

/**
 *
 * @author r48b132
 */
public class Graphs {
    //stores lists of vertex and edges
    private ArrayList<Vertex> vertex = new ArrayList();
    private ArrayList<Edge> edge = new ArrayList();

    public void addVertex(Vertex in_vertex) {
        vertex.add(in_vertex);
    }

    public void addEdge(Edge in_edge) {
        edge.add(in_edge);
    }

    public ArrayList<Vertex> getVertex() {
        return vertex;
    }

    public ArrayList<Edge> getEdge() {
        return edge;
    }
    
    public void removeVertex(Vertex in_vertex){
        vertex.remove(in_vertex);
    }
    
    public void removeEdge(Edge in_edge){
        edge.remove(in_edge);
    }
    
    public void clearEdges(){
        edge.clear();
    }
    
    public void clearVertex(){
        vertex.clear();
    }
    
}
