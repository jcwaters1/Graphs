/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;

/**
 *
 * @author r48b132
 */
public class BinaryTree extends Graphs {

    private BinaryTreeVertex root;

    public void setRoot(BinaryTreeVertex in_root) {
        root = in_root;
    }

    public BinaryTreeVertex getRoot() {
        return root;
    }

    public BinaryTreeVertex iterativeTreeSearch(BinaryTreeVertex x, int k) {
        while (x != null && k != x.getVValue()) {
            if (k < x.getVValue()) {
                x = x.getLChild();
            } else {
                x = x.getRChild();
            }
        }
        return x;
    }

    public BinaryTreeVertex treeSearch(BinaryTreeVertex x, int k) {
        if (x == null || k == x.getVValue()) {
            return x;
        }
        if (k < x.getVValue()) {
            return treeSearch(x.getLChild(), k);
        } else {
            return treeSearch(x.getRChild(), k);
        }
    }

    public void treeInsert(BinaryTree T, BinaryTreeVertex node) {
        BinaryTreeVertex y;
        BinaryTreeVertex x;
        y = null;
        x = this.root;

        while (x != null) {
            y = x;
            if (node.getVValue() < x.getVValue()) {
                x = x.getLChild();
            } else {
                x = x.getRChild();
            }
        }

        node.setParent(y);

        if (y == null) {
            this.root = node;
        } else if (node.getVValue() < y.getVValue()) {
            y.setLChild(node);
        } else {
            y.setRChild(node);
        }

        Edge edgeToAdd = new Edge(node, node.getParent());
        if (node.getLChild() != null) {
            edgeToAdd.setEdgeLabel("Left");
        } else {
            edgeToAdd.setEdgeLabel("Right");
        }
        this.addEdge(edgeToAdd);
        this.addVertex(node);
    }

    public void transplant(BinaryTree T, BinaryTreeVertex u, BinaryTreeVertex v) {
        if (u.getParent() == null) {
            this.root = v;
        } else if (u == u.getParent().getLChild()) {
            u.getParent().setLChild(v);
        } else {
            u.getParent().setRChild(v);
        }
        if (v != null) {
            v.setParent(u.getParent());
        }
    }

    public void treeDelete(BinaryTree T, BinaryTreeVertex node) {
        BinaryTreeVertex y;
        T.removeVertex(node);
        if (node.getLChild() == null) {
            transplant(this, node, node.getRChild());
        } else if (node.getRChild() == null) {
            transplant(this, node, node.getLChild());
        } else {
            y = treeMinimum(node.getRChild());
            if (y.getParent() != node) {
                transplant(this, y, y.getRChild());
                y.setRChild(node.getRChild());
                y.getRChild().setParent(y);
            }
            transplant(this, node, y);
            y.setLChild(node.getLChild());
            y.getLChild().setParent(y);
        }

    }

    public BinaryTreeVertex treeMinimum(BinaryTreeVertex in_vertex) {
        while (in_vertex.getLChild() != null) {
            in_vertex = in_vertex.getLChild();
        }
        return in_vertex;
    }

    public void inOrderTreeTraversal(BinaryTreeVertex x) {
        super.clearEdges();
        Edge edge;
        if (x != null) {
            inOrderTreeTraversal(x.getLChild());
            System.out.println(x.getVValue());
//            if(x.getLChild() != null){
//                edge = new Edge(x, x.getLChild());
//                this.addEdge(edge);
//            }
            inOrderTreeTraversal(x.getRChild());
//            System.out.println(x.getVValue());
//            if(x.getLChild() != null){
//                edge = new Edge(x, x.getRChild());
//                this.addEdge(edge);
//            }
            
        }
    }

}
