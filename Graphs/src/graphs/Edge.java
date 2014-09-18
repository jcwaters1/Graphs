package graphs;

/**
 *
 * @author r48b132
 */
public class Edge {

    //class variables for starting and ending vertex
    private int eValue;
    private Vertex startVertex;
    private Vertex endVertex;
    private String edgeLabel;

    public Edge(Vertex in_x, Vertex in_y) {
        //sets vertex as start and end
        startVertex = in_x;
        endVertex = in_y;
    }

    public Vertex getStart() {
        return startVertex;
    }

    public Vertex getEnd() {
        return endVertex;
    }

    public void setValue(int in_eValue) {
        eValue = in_eValue;
    }

    public int getValue() {
        return eValue;
    }

    @Override
    public String toString() {
        return edgeLabel + "";
    }
    
    public String getEdgeLabel(){
        return edgeLabel;
    }
    
    public void setEdgeLabel(String in_label){
        edgeLabel = in_label;
    }

}
