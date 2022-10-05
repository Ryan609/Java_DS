package DS.zuoClass.Heap;

/**
 * @author: xinyan
 * @data: 2022/10/03/14:52
 **/
public class Heap {

    public static class MyMaxHeap {
        private int[] heap;
        private final int limit;
        private int heapSize;

        public MyMaxHeap(int limit) {
            heap = new int[limit];
            this.limit = limit;
            heapSize = 0;
        }

        public boolean isEmpty() {
            return heapSize == 0;
        }

        public boolean isFull() {
            return heapSize == limit;
        }

        public void push(int value) {
            if (heapSize == limit) {
                throw new RuntimeException("heap is full");
            }
            heap[heapSize] = value;
            // siftUp后 heapsize++; 相当于siftUp(heap, heapSize);  heapsize++;
            siftUp(heap, heapSize++);
        }

        // 用户此时，让你返回最大值，并且在大根堆中，把最大值删掉
        // 剩下的数，依然保持大根堆组织
        public int pop() {
            if (heapSize == 0) {
                throw new RuntimeException("heap is empty");
            }
            int ans = heap[0];
            swap(heap, 0, --heapSize);
            siftDown(heap, 0, heapSize);
            return ans;
        }

        // 新加进来的数，现在停在了index位置，请依次往上移动，
        // 移动到0位置，或者干不掉自己的父亲了，停！
        private void siftUp(int[] arr, int index) {
            // 和父节点比大小: 父节点计算公式 (index - 1) /2
            while (arr[index] > arr[(index-1)/2]) {
                swap(heap, index, (index-1)/2);
                index = (index-1)/2;
            }
        }

        // 从index位置，往下看，不断的下沉
        // 停：较大的孩子都不再比index位置的数大；已经没孩子了
        private void siftDown(int[] arr, int index, int heapSize) {
            // 先找到这个index位置是否还有左孩子.
            int left = (index * 2) + 1;
            // 左孩子没有越界
            while (left < heapSize) {
                // 此时有左孩子, 查看是否有右孩子并对比左孩子和右孩子哪个大.
                int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left+1 : left;
                // 查看index是否比largest大.
                largest = arr[largest] > arr[index] ? largest : index;
                // 说明此时已经下沉到相应位置
                if (largest == index) {
                    break;
                }
                swap(arr, largest, index);
                index = largest;
                left = index * 2 + 1;
            }
        }

        private void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
