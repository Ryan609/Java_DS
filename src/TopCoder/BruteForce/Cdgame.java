package TopCoder.BruteForce;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: xinyan
 * @data: 2022/08/10/10:14
 **/
public class Cdgame {
    public static void main(String[] args) {
        System.out.println(rescount(new int[]{1,2}, new int[]{3,4}));
        System.out.println(rescount(new int[]{1,2,4}, new int[]{8,16,32}));
        System.out.println(rescount(new int[]{1,1,1}, new int[]{1,1,1}));
        System.out.println(rescount(new int[]{1,2,3}, new int[]{5,5,5}));
        System.out.println(rescount(new int[]{3,3,4,1}, new int[]{2,2,2,100}));
        System.out.println(rescount(new int[]{31,34,55,56,57}, new int[]{1,2,3,4,5}));
    }

    public static int rescount(int[] a, int[] b){
        int num1 = 0;
        for (int n:a) {
            num1 += n;
        }
        int num2 = 0;
        for (int m:b) {
            num2 += m;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                set.add((num1-a[i]+b[j]) * (num2-b[j]+a[i]));
            }
        }
        return set.size();
    }
}
