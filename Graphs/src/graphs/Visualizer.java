package graphs;

/**
 *
 * @author John
 */
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visualizer extends JPanel {

    //class variables
    private DelegateForest forest;
    private Graphs in_graph;
    private JFrame frame;
    private Edge edge;
    private BasicVisualizationServer server;

    public void Visualizer(Graphs in_graph) {
        //sets inputted graph
        this.in_graph = in_graph;
    }

    public void convertGraph(Graphs in_graph) {
        //converts and adds vertices and edges to delegate forest
        forest = new DelegateForest();

        forest.setRoot(in_graph.getVertex().get(0));

        for (int i = 1; i < in_graph.getVertex().size(); i++) {
            forest.addVertex(in_graph.getVertex().get(i));
        }

        for (int i = 0; i < in_graph.getEdge().size(); i++) {
            forest.addEdge(i, in_graph.getEdge().get(i).getEnd(), in_graph.getEdge().get(i).getStart());
        }
    }

    public void showEdgeValues() {
        server.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<Edge>());
    }

    public void gui() {
        //JFrame setup
        frame = new JFrame("Graphs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));
        server = new BasicVisualizationServer(new TreeLayout(forest));
        server.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        //server.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        frame.add(server);
        frame.pack();

        frame.setVisible(true);
    }
    

}
