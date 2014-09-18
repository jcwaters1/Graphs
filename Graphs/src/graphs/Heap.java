/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author John
 */
public class Heap extends BinaryTree {

    private List<Integer> intList = new ArrayList<>();
    private int size;

    public Heap() {
        
    }

    public void addToList() {
        for(int i = 0; i < super.getVertex().size(); i++){
            intList.add(super.getVertex().get(i).getVValue());
        }
    }

    public int getIndexValue(int in_index) {
        return intList.get(in_index);
    }

    public List getList() {
        return intList;
    }

    public int getSize() {
        return intList.size() - 1;
    }
    
    //Heap algorithm is from the one you provided from the book.

    public void heapsort(Heap in_heap) {
        System.out.println("IntList: " + intList);
        buildMaxHeap(in_heap);
        size = in_heap.getSize();
        for (int i = in_heap.getSize()/2; i > 1; i--) {
            Collections.swap(in_heap.getList(), 1, i);
            maxHeapify(in_heap, 1);
        }
        System.out.println("Heapsort complete. Final heap: ");
        System.out.print("IntList: [");
        for (int h = 0; h <= in_heap.getSize(); h++) {
            System.out.print(in_heap.getList().get(h) + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public void buildMaxHeap(Heap in_heap) {
        for (int i = in_heap.getSize() / 2; i >= 0; i--) {
            maxHeapify(in_heap, i);
        }
        System.out.println("Build max heap complete. Heap:");
        System.out.print("IntList: [");
        for (int h = 0; h <= in_heap.getSize(); h++) {
            System.out.print(in_heap.getList().get(h) + ", ");
        }
        System.out.print("]");
        System.out.println();
    }


    public void maxHeapify(Heap in_heap, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        if (l <= in_heap.getSize() && (int) in_heap.getList().get(l) > (int) in_heap.getList().get(i)) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= in_heap.getSize() && (int) in_heap.getList().get(r) > (int) in_heap.getList().get(largest)) {
            largest = r;
        }
        if (largest != i) {           
            Collections.swap(in_heap.getList(), i, largest);
            maxHeapify(in_heap, largest);
        }
    }
    
}
