package LeetCode.Greedy;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/10/12/10:53
 **/
public class MiniatureDachshund {

    public static int maxMikan(int[] mikan, int weight) {
        Arrays.sort(mikan);
        int count = 0;
        for (int i = 0; i < mikan.length; i++) {
            if (weight <= 5000 && (weight + mikan[i]) <= 5000) {
                weight += mikan[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxMikan(new int[] {100, 100, 100, 100, 100}, 4750));
        System.out.println(maxMikan(new int[] {100, 100, 100, 100, 50}, 4750));
        System.out.println(maxMikan(new int[] {120, 90, 130, 100, 110, 80}, 3000));
        System.out.println(maxMikan(new int[] {50}, 5000));
        System.out.println(maxMikan(new int[] {200, 50, 200, 50, 200, 50, 200, 50}, 4800));

    }
}
