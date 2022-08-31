package DS.Bit_DS.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author: xinyan
 * @data: 2022/05/17/20:05
 **/
public class MaxHeap {
    private List<Integer> elementData;
    private int size;

    public MaxHeap() { this(10); }

    public MaxHeap(int size) { elementData = new ArrayList<>(size); }


    //得到索引k的父节点
    private int getParent(int k) {
        return (k - 1) / 2;
    }

    //得到k的左子树节点
    private int getLeftNode(int k) {
        return (2 * k) + 1;
    }

    //得到k的右子树节点
    private int getRightNode(int k) {
        return (2 * k) + 2;
    }

    //添加一个元素后执行上浮操作.
    public void add(int val) {
        elementData.add(val);
        size ++;
        siftUp(size - 1);
    }

    /**
     * 将任意的整型数组arr调整为堆
     * @param arr
     */
    public MaxHeap(int[] arr) {
        elementData = new ArrayList<>(arr.length);
        // 1.先将所有元素复制到data数组中
        for (int i : arr) {
            elementData.add(i);
            size ++;
        }
        // 2.从最后一个非叶子结点开始进行siftDown操作
        for (int i = getParent(size - 1); i >= 0; i--) {
            siftDown(i);
        }
    }

    public int extraMax(int val) {
        if (size == 0) {
            throw new NoSuchElementException("Heap is empty");
        }
        int max = elementData.get(0);
        //将数组末尾元素移动到堆顶
        elementData.set(0, elementData.get(size-1));
        elementData.remove(size-1);
        size--;
        siftDown(0);
        return max;
    }

    //上浮操作, 维护最大堆
    private void siftUp(int k) {
        while (k > 0 && elementData.get(k) > elementData.get(getParent(k))) {
            swap(k, getParent(k));
            k = getParent(k);
        }
    }

    //下沉操作
    private void siftDown(int k) {
        // 还存在子树
        while (getLeftNode(k) < size) {
            int j = getLeftNode(k);
            //此时还存在右子树 && 右子树的值还比左子树大
            if (j + 1 < size && elementData.get(j+1) > elementData.get(j)) {
                j++; // 索引j一定对应了左右子树的最大值索引
            }
            // 当前元素 >= 左右子树最大值，下沉结束，元素k落在了最终位置
            if(elementData .get(k) >= elementData.get(j)) {
                break;
            }else {
                swap(k,j);
                k = j;
            }
        }
    }

    //交换节点位置
    private void swap(int k, int parent) {
        int child = elementData.get(k);
        int parentVal = elementData.get(parent);
        elementData.set(k,parentVal);
        elementData.set(parent,child);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public  int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return elementData.toString();
    }
}
