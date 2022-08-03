package TopCoder.Math;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/08/02/14:28
 **/
public class AdditionGame {
    public static void main(String[] args) {
        System.out.println(getMaximumPoints(8,2,6,13));
    }

    public static int getMaximumPoints(int A, int B, int C, int N) {
        int[] arr = {A,B,C};
        int sum = 0;

        while(N > 0) {
            Arrays.sort(arr);
            if (arr[2] == 0) {
                break;
            }
            sum += arr[2];
            arr[2] -= 1;
            N--;
        }
        return sum;
    }
}
