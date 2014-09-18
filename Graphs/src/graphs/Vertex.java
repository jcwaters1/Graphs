package graphs;

/**
 *
 * @author r48b132
 */
public class Vertex {
    //vertex value
    private int vValue;

    public Vertex(int in_value){
        vValue = in_value;
    }
     
    public void setVValue(int value) {
        this.vValue = value;
    }

    public int getVValue() {
        return vValue;
    }

    @Override
    public String toString() {
        return Integer.toString(vValue);
    }
}
