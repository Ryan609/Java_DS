package DS.zuoClass.Sort;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author: xinyan
 * @data: 2022/09/21/20:39
 **/
public class 快速排序 {

    // 方法1
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    private static void process(int[] arr, int L, int R) {
        if (L >= R) {
            return;
        }
        swap(arr, L + (int)(Math.random() * (R - L + 1)), R);
        int[] equalArea = partition(arr, L, R);
        process(arr, L, equalArea[0] - 1);
        process(arr, equalArea[0] + 1, R);
    }

    private static int[] partition(int[] arr, int L, int R) {
        if (L > R) {
            return new int[] {-1, -1};
        }
        if (L == R) {
            return new int[] {L, R};
        }
        int less = L - 1;
        int more = R;
        int index = L;
        while (index < more) {
            if (arr[index] == arr[R]) {
                index++;
            } else if (arr[index] < arr[R]) {
                swap(arr, index++, ++less);
            } else {
                swap(arr, index, --more);
            }
        }
        swap(arr, more, R);
        return new int[] {less + 1, more};
    }


    // 方法二
    public static void quickSort1(int[] arr) {

        quickSortInternal(arr,0, arr.length - 1);
    }

    private static void quickSortInternal(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partiton(arr,l,r);
        quickSortInternal(arr, l, p - 1);
        quickSortInternal(arr, p+1, r);

    }

    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    private static int partiton(int[] arr, int l, int r) {
        int randomIndex = random.nextInt(l,r);
        swap(arr,l,randomIndex);
        int v = arr[l];
        int j = l;
        for (int i = j+1; i <= r; i++) {
            if (arr[i] < v) {
                swap(arr, i,j+1);
                j++;
            }
        }
        swap(arr,l,j);
        return  j;
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
