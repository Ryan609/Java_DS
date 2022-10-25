package TopCoder.Graph;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/10/26/09:23
 **/
public class SortingSubsets {

    public static int getMinimalSize(int[] a) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (arr[i] != a[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getMinimalSize(new int[] {3, 2, 1}));
        System.out.println(getMinimalSize(new int[] {1, 2, 3, 4}));
        System.out.println(getMinimalSize(new int[] {4, 4, 4, 3, 3, 3}));
        System.out.println(getMinimalSize(new int[] {11, 11, 49, 7, 11, 11, 7, 7, 11, 49, 11}));
    }
}
