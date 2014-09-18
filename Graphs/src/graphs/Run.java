package graphs;

/**
 *
 * @author John
 */
public class Run {

    public static void main(String args[]) {
        //Lab 1---------------------------------------------------------------
//        //instances
//        Visualizer visualizer = new Visualizer();
//        Vertex vertex = new Vertex();
//        Vertex vertex1 = new Vertex();
//        Vertex vertex2 = new Vertex();
//        Vertex vertex3 = new Vertex();
//        Vertex vertex4 = new Vertex();
//        Vertex vertex5 = new Vertex();
//        Edge edge = new Edge();
//        Edge edge1 = new Edge();
//        Edge edge2 = new Edge();
//        Edge edge3 = new Edge();
//        Edge edge4 = new Edge();
//        Graphs graph = new Graphs();
//
//        //add vertices
//        vertex.Vertex(0);
//        graph.addVertex(vertex);

//        vertex1.Vertex(1);
//        graph.addVertex(vertex1);
//
//        vertex2.Vertex(2);
//        graph.addVertex(vertex2);
//
//        vertex3.Vertex(3);
//        graph.addVertex(vertex3);
//
//        vertex4.Vertex(4);
//        graph.addVertex(vertex4);
//
//        vertex5.Vertex(5);
//        graph.addVertex(vertex5);
//
//        //add edges in format (end, start)
//        edge.Edge(vertex, vertex1);
//        graph.addEdge(edge);
//
//        edge1.Edge(vertex1, vertex4);
//        graph.addEdge(edge1);
//
//        edge2.Edge(vertex2, vertex1);
//        graph.addEdge(edge2);
//
//        edge3.Edge(vertex3, vertex1);
//        graph.addEdge(edge3);
//
//        edge4.Edge(vertex5, vertex2);
//        graph.addEdge(edge4);

       
        
        //convert graph to delegate forest
//        visualizer.convertGraph(graph);
//        visualizer.Visualizer(graph);

        //JFrame
        //visualizer.gui();
        
        //Lab 2---------------------------------------------------------------
        
//        BinaryTree tree = new BinaryTree();
//        BinaryTreeVertex btv = new BinaryTreeVertex (50);
//        tree.setRoot(btv);
//        BinaryTreeVertex btv1 = new BinaryTreeVertex (34);
//        tree.treeInsert(tree, btv1);
//        BinaryTreeVertex btv2 = new BinaryTreeVertex (23);
//        tree.treeInsert(tree, btv2);
//        BinaryTreeVertex btv3 = new BinaryTreeVertex (21);
//        tree.treeInsert(tree, btv3);
//        BinaryTreeVertex btv4 = new BinaryTreeVertex (68);
//        tree.treeInsert(tree, btv4);
//        BinaryTreeVertex btv5 = new BinaryTreeVertex (43);
//        tree.treeInsert(tree, btv5);
//        BinaryTreeVertex btv6 = new BinaryTreeVertex (234);
//        tree.treeInsert(tree, btv6);
//        BinaryTreeVertex btv7 = new BinaryTreeVertex (344);
//        tree.treeInsert(tree, btv7);
//        BinaryTreeVertex btv8 = new BinaryTreeVertex (223);
//        tree.treeInsert(tree, btv8);
//        BinaryTreeVertex btv9 = new BinaryTreeVertex (91);
//        tree.treeInsert(tree, btv9);
//        BinaryTreeVertex btv10 = new BinaryTreeVertex (62);
//        tree.treeInsert(tree, btv10);
//        BinaryTreeVertex btv11 = new BinaryTreeVertex (13);
//        tree.treeInsert(tree, btv11);
//        BinaryTreeVertex btv12 = new BinaryTreeVertex (54);
//        tree.treeInsert(tree, btv12);        
//        BinaryTreeVertex btv13 = new BinaryTreeVertex (563);
//        
//        System.out.println(tree.treeSearch(tree.getRoot(), 91));                //shows value 91 can be found
//        System.out.println(tree.treeSearch(tree.getRoot(), 944));               // shows 944 isnt in the tree
//        System.out.println(tree.iterativeTreeSearch(tree.getRoot(), 68));       //shows 68 is found
//        System.out.println(tree.iterativeTreeSearch(tree.getRoot(), 515));      //shows 515 isnt in the tree
//        
//        System.out.println(tree.treeSearch(tree.getRoot(), 54));                //before deletion, 54 is found
//        tree.treeDelete(tree, btv12);
//        System.out.println(tree.treeSearch(tree.getRoot(), 54));                //after deletion, 54 is not found
//        
////        System.out.println("TreeValues:");
////        tree.inOrderTreeTraversal(tree.getRoot());                              //tree traversal works, as seen in the System.out.prinln(), but i couldnt get the visualizer to coorperate
//                
//        System.out.println("Root before transplant: " + tree.getRoot());        //shows root before transplant
//        tree.transplant(tree, btv, btv4);        
//        System.out.println("Root after transplant: " + tree.getRoot());          //shows root got changed to btv4, showing transplant works correctly
//        
//        
//        visualizer.convertGraph(tree);
//        visualizer.Visualizer(tree);
//        
//        visualizer.gui();
        
        //Lab 3------------------------------------------------------------------
       
        //add heapVertex
        
        Heap heap = new Heap();
        
        HeapVertex hv1 = new HeapVertex(12);
        heap.treeInsert(heap, hv1);
        hv1.setIndex(0);
                
        HeapVertex hv2 = new HeapVertex(23);
        heap.treeInsert(heap, hv2);
        hv2.setIndex(1);
        
        HeapVertex hv3 = new HeapVertex(62);
        heap.treeInsert(heap, hv3);
        hv3.setIndex(2);
                       
        HeapVertex hv4 = new HeapVertex(18);
        heap.treeInsert(heap, hv4);
        hv4.setIndex(3);
        
        HeapVertex hv5 = new HeapVertex(76);
        heap.treeInsert(heap, hv5);
        hv5.setIndex(4);
        
        HeapVertex hv6 = new HeapVertex(34);
        heap.treeInsert(heap, hv6);
        hv6.setIndex(5);
        
        HeapVertex hv7 = new HeapVertex(676);
        heap.treeInsert(heap, hv7);
        hv7.setIndex(6);
        
        HeapVertex hv8 = new HeapVertex(232);
        heap.treeInsert(heap, hv8);
        hv8.setIndex(7);
        
        HeapVertex hv9 = new HeapVertex(16);
        heap.treeInsert(heap, hv9);
        hv9.setIndex(8);
        
        heap.addToList();
        heap.heapsort(heap);
        
        //parent and children demo:
        
        System.out.println(heap.getList().get(0) + "'s children:");
        System.out.println(heap.getList().get(hv1.getLC()));
        System.out.println(heap.getList().get(hv1.getRC()));
        
        System.out.println();
        
        System.out.println(heap.getList().get(1) + "'s children:");
        System.out.println(heap.getList().get(hv2.getLC()));
        System.out.println(heap.getList().get(hv2.getRC()));
        
        System.out.println();
        
        System.out.println(heap.getList().get(2) + "'s children:");
        System.out.println(heap.getList().get(hv3.getLC()));
        System.out.println(heap.getList().get(hv3.getRC()));
        
        System.out.println();
        
        System.out.println(heap.getList().get(3) + "'s children:");
        System.out.println(heap.getList().get(hv4.getLC()));
        System.out.println(heap.getList().get(hv4.getRC()));
        
        System.out.println();
        
        System.out.println(heap.getList().get(3) + "'s parent:");
        System.out.println(heap.getList().get(hv4.getP()));
        
        System.out.println();
        
        System.out.println(heap.getList().get(2) + "'s parent:");
        System.out.println(heap.getList().get(hv3.getP()));
        
        System.out.println();
        
        System.out.println(heap.getList().get(6) + "'s parent:");
        System.out.println(heap.getList().get(hv7.getP()));
        
        //used the treeInsert algorithm above so tree functions would still work:
        System.out.println();
        System.out.println("Search for 232: " + heap.treeSearch(heap.getRoot(), 232));
        System.out.println("Search for 55: " + heap.treeSearch(heap.getRoot(), 55));
    }
}
