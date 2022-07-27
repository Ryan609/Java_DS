package TopCoder.Math;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/07/27/15:25
 **/
public class Soccer {
    public static void main(String[] args) {
        System.out.println(maxPoints(new int[]{1, 4, 3, 0, 0}, new int[]{3, 1, 5, 3, 1}));

        System.out.println(maxPoints(new int[]{13, 79, 26, 73, 14, 89, 71, 37, 89, 71, 19, 59, 39},
                new int[]{88, 27, 5, 70, 84, 94, 20, 50, 2, 11, 31, 22, 50}));

        System.out.println(maxPoints(new int[]{63, 64, 93, 4, 99, 30, 25, 18, 72, 84, 55, 15, 1, 20, 19, 22, 74, 6, 80, 35, 3, 89, 7, 1, 91, 74, 6, 75, 88, 26, 51, 92, 43, 21, 5, 95, 66, 96, 40, 40, 51, 33, 76, 29, 70, 24, 13},
                new int[]{14, 46, 100, 23, 3, 38, 55, 99, 30, 70, 54, 11, 96, 48, 64, 79, 12, 60, 99, 48, 75, 69, 47, 21, 19, 48, 51, 38, 23, 36, 41, 14, 90, 54, 50, 89, 89, 44, 7, 73, 86, 49, 95, 100, 29, 24, 38}));
    }


    public static int maxPoints(int[] wins, int[] ties) {
        int[] arr = new int[wins.length];
        for (int i = 0; i < wins.length; i++) {
            arr[i] = wins[i]*3 + ties[i]*1;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
