package TopCoder.BruteForce;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/08/10/09:41
 **/
public class LittleElephantAndBooks {

    public static void main(String[] args) {
        System.out.println(getNumber(new int[]{1, 2},1));
        System.out.println(getNumber(new int[]{74, 7, 4, 47, 44},3));
        System.out.println(getNumber(new int[]{3, 1, 9, 7, 2, 8, 6, 4, 5},7));
        System.out.println(getNumber(new int[]{74, 86, 32, 13, 100, 67, 77},2));
    }

    public static int getNumber(int[] pages, int number) {
        int[] arr = pages;
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < number-1; i++) {
            res += arr[i];
        }
        res += arr[number];
        return res;
    }
}
