package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/20:11
 **/
public class MinimumCostMoveChips {

    // 奇数和偶数分别放, 取最小值.
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
