package DS.zuoClass.Sort;

/**
 * @author: xinyan
 * @data: 2022/10/03/15:57
 **/
public class heapSort {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 将数组进行建堆操作
        for (int i = arr.length - 1; i >= 0; i--) {
            siftDown(arr, i, arr.length);
        }
        int heapSize = arr.length;
        while (heapSize > 0) {
            // 将数组中最大的数设为堆顶
            siftDown(arr, 0, heapSize);
            // 将堆顶的数放到最后并缩小size范围(固定最后一个数不动)
            swap(arr, 0, --heapSize);
        }
    }

    public static void siftDown(int[] arr, int index, int heapSize) {
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

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
