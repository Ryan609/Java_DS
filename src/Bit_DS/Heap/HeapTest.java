package Bit_DS.Heap;

/**
 * @author: xinyan
 * @data: 2022/05/18/17:39
 **/
public class HeapTest {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.add(62);
        maxHeap.add(41);
        maxHeap.add(30);
        maxHeap.add(28);
        maxHeap.add(16);
        maxHeap.add(22);
        maxHeap.add(13);
        maxHeap.add(19);
        maxHeap.add(17);
        maxHeap.add(15);
        maxHeap.add(52);
        System.out.println(maxHeap);
    }
}
