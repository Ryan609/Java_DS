package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/15:11
 **/
public class 买卖股票的最佳时机II_122 {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[i+1]) {
                res += prices[i+1] - prices[i];
            }
        }
        return res;
    }
}
