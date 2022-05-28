package Bit_DS.Sort;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/05/27/09:44
 **/
public class SevenSort {

    public static void main(String[] args) {
//        int n = 300000;
//        int[] arr = SortHelper.generaRandomArray(n,0,Integer.MAX_VALUE);
//        int[] arr1 = SortHelper.arrCopy(arr);
//        int[] arr2 = SortHelper.arrCopy(arr);
//        int[] arr3 = SortHelper.arrCopy(arr);
//        int[] arr4 = SortHelper.arrCopy(arr);
//        int[] arr5 = SortHelper.arrCopy(arr);
////        SortHelper.testSort(arr,"selectionSort");
////        SortHelper.testSort(arr2,"selectionSortOP");
////        SortHelper.testSort(arr3,"insertionSort");
////        SortHelper.testSort(arr1,"insertionSortBS");
//        SortHelper.testSort(arr4,"shellSort");
        //int[] arr = {8,6,2,3,1,5,7,4};
        int[] arr = {8,6,2,1};

        mergeSort(arr);
    }

    /**
     * 数组的交换
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }


    /**
     * 双向选择排序
     * @param arr
     */
    public static void doubleSelectSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int min = low;
            int max = low;
            for (int i = low + 1; i <= high; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
            swap(arr,low,min);
            if (max == low) {
                max = min;
            }
            swap(arr,high,max);
            low++;
            high--;
        }
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubllSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    /**
     * 直接插入排序
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] > arr[j - 1]) {
                    break;
                } else {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static void insertionSortBS(int[] arr) {
        // 有序区间[0..i)
        // 无序区间[i..n)
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            // 有序区间[left...right)
            int left = 0;
            int right = i;
            while (left < right) {
                int mid = (left + right) / 2;
                if (val < arr[mid]) {
                    right = mid;
                }else {
                    // val >= arr[mid]
                    left = mid + 1;
                }
            }
            // 搬移[left..i)的元素
            for (int j = i; j > left ; j--) {
                arr[j] = arr[j - 1];
            }
            // left就是待插入的位置
            arr[left] = val;
        }
    }

    /**
     * 希尔排序
     * @param arr
     */
    public static void shellSort(int[] arr) {
        int gap = arr.length >> 1;
        while (gap >= 1) {
            insertionSortByGap(arr, gap);
            gap = gap >> 1;
        }
    }

    /**
     * 插入排序改进版希尔排序
     * @param arr
     * @param gap
     */
    private static void insertionSortByGap(int[] arr, int gap) {
        for (int i = gap; i < arr.length; i++) {
            for (int j = i; j - gap >= 0 && arr[j] < arr[j-gap]; j--) {
                swap(arr,j,j-gap);
            }
        }
    }

    public static void mergeSort(int[] arr) {
        mergeSortInternal(arr, 0, arr.length - 1);
    }

    private static void mergeSortInternal(int[] arr, int left, int right) {
        if (left < right) {
            //find middle index
            int mid = (right + left) / 2;
            //Use recursion to find the left side of the array
            mergeSortInternal(arr, left, mid);
            //Use recursion to find the reight side of the array
            mergeSortInternal(arr, mid+1, right);
            //Call the merge method to merge the array
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        // 先创建一个新的数组aux,将子数组的值复制给新数组
        int[] aux = new int[right - left + 1];
        // l = 2,r = 4
        // arr[2..4]
        // aux[0..2] 索引下标差了个l偏移量
        for (int i = 0; i < aux.length; i++) {
            // aux的索引下标0...arr.length - 1
            // arr的下标l...r
            aux[i] = arr[i + left];
        }

        // 数组1的开始下标
        int i = left;
        // 数组2的开始下标
        int j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                // 第一个数组已经遍历完毕
                arr[k] = aux[j - left];
                j ++;
            }else if (j > right) {
                // 第二个子数组遍历完毕
                arr[k] = aux[i - left];
                i ++;
            }else if (aux[i - left] <= aux[j - left]) {
                // 将aux[i - l]写回arr[k]
                arr[k] = aux[i - left];
                i ++;
            }else {
                // aux[i - l] > aux[j - l] 写回aux[j - l]
                arr[k] = aux[j - left];
                j ++;
            }
        }
    }

}
