package Bit_DS.Heap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xinyan
 * @data: 2022/05/17/20:05
 **/
public class MaxHeap {
    private List<Integer> elementData;
    private int size;

    public MaxHeap() {
        this(10);
    }

    public MaxHeap(int size) {
        elementData = new ArrayList<>(size);
    }

    private int getParent(int k) {
        return (k - 1) / 2;
    }

    private int getLeftNode(int k) {
        return (2 * k) + 1;
    }

    private int getRightNode(int k) {
        return (2 * k) + 2;
    }

    public void add(int val) {
        elementData.add(val);
        size ++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public  int getSize() {
        return size;
    }
}
