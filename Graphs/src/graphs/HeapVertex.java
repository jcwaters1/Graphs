/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;

/**
 *
// * @author John
 */
public class HeapVertex extends BinaryTreeVertex {

    private int index;
    private int lC;
    private int rC; 
    private int parent;

    public HeapVertex(int in_value) {
        super(in_value);
    }

    public int getLC() {
        lC = 2 * index + 1;
        return lC;
    }

    public int getRC() {
        rC = 2 * index + 2;
        return rC;
    }
    
    public int getP(){
        parent = (int)Math.floor((index - 1) / 2);
        return parent;
    }
    
    public void setIndex(int in_index){
        index = in_index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return Integer.toString(super.getVValue()) + "";
    }

}
