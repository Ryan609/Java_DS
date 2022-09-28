package DS.Sort;

/**
 * @author: xinyan
 * @data: 2022/09/20/18:21
 **/
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    private static void process(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        process(arr, l, mid);
        process(arr, mid+1, r);
        mergeHelp(arr, l, mid, r);
    }

    private static void mergeHelp(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        // 当前左半边数组和右半边数组都没有越界, 说明还可以合并.
        while (p1 <= mid && p2 <= right) {
            temp[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 下面两个while只会走一个, 因为不会有两个同时越界
        // 说明p2(右半边数组已经越界) 将左半边数组剩下的元素直接移到新数组中
        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        // 说明p1(左半边数组已经越界) 将右半边数组剩下的元素直接移到新数组中
        while (p2 <= right) {
            temp[i++] = arr[p2++];
        }
        for (i = 0; i < temp.length; i++) {
            arr[left+i] = temp[i];
        }
    }
}
