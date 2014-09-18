package graphs;



/**
 *
 * @author r48b132
 */
public class BinaryTreeVertex extends Vertex{
    private BinaryTreeVertex lChild;
    private BinaryTreeVertex rChild;
    private BinaryTreeVertex parent;

    public BinaryTreeVertex(int in_value) {
        super(in_value);
    }
    
    public void setLChild(BinaryTreeVertex in_lChild){
        lChild = in_lChild;
    }
    
    public void setRChild(BinaryTreeVertex in_rChild){
        rChild = in_rChild;
    }
    
    public void setParent(BinaryTreeVertex in_parent){
        parent = in_parent;
    }
    
    public BinaryTreeVertex getLChild(){
        return lChild;
    }
    
    public BinaryTreeVertex getRChild(){
        return rChild;
    }
    
    public BinaryTreeVertex getParent(){
        return parent;
    }
    
}
