package DS.Sort;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/08/30/17:36
 **/
public class 插入排序 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,1,11,2,4,55,22};

        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
