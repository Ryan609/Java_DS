package DS.zuoClass.Sort;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/08/30/17:48
 **/
public class 选择排序 {

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i,min);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,1,11,2,4,55,22};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
