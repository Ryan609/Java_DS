package TopCoder.Recursion;


import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/08/31/09:45
 **/
public class SortingSubsets {

    public static int getMinimalSize(int[] a) {
        int res = 0;
        int[] oldArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            oldArr[i] = a[i];
        }

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (oldArr[i] != a[i]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getMinimalSize(new int[] {3, 2, 1}));
    }
}
