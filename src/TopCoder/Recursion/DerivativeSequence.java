package TopCoder.Recursion;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/08/31/09:15
 **/
public class DerivativeSequence {
    public static int[] derSeq(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int[] res = new int[a.length-1];
            for (int j = 0; j < res.length; j++) {
                res[j] = a[j+1] - a[j];
            }
            a = res;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(derSeq(new int[] {5,6,3,9,-1} , 1)));
        System.out.println(Arrays.toString(derSeq(new int[] {5,6,3,9,-1} , 2)));
        System.out.println(Arrays.toString(derSeq(new int[] {4,4,4,4,4,4,4,4} , 3)));
        System.out.println(Arrays.toString(derSeq(new int[] {-100,100} , 0)));
    }
}
