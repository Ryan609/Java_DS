package DS.DP;

/**
 * @author: xinyan
 * @data: 2022/09/13/10:35
 * arr是面值数组，其中的值都是正数且没有重复。再给定一个正数aim。
 * 每个值都认为是一种面值，且认为张数是无限的。
 * 返回组成aim的最少货币数
 **/
public class 最少货币数 {

    public static int minCoins(int[] arr, int aim) {
        return process(arr, 0, aim);
    }

    // 暴力递归
    // arr[index...]面值，每种面值张数自由选择，
    // 搞出rest正好这么多钱，返回最小张数
    // 拿Integer.MAX_VALUE标记怎么都搞定不了
    public static int process(int[] arr, int index, int rest) {
        if (rest < 0) {
            return Integer.MAX_VALUE;
        }
        if (index == arr.length) {
            return rest == 0 ? 0 : Integer.MAX_VALUE;
        } else {
            int ans = Integer.MAX_VALUE;
            for (int zhang = 0; zhang * arr[index] <= rest; zhang++) {
                int next = process(arr, index+1, rest - zhang * arr[index]);
                if (next != Integer.MAX_VALUE) {
                    ans = Math.min(ans, next + zhang);
                }
            }
            return ans;
        }
    }

    // 改进为 有枚举行为的动态规划
    public static int dp(int[] arr, int aim) {
        if (aim == 0) {
            return 0;
        }
        int N = arr.length;
        int[][] dp = new int[N+1][aim+1];
        // 最后一行 (N,0) 设为0, 其余都为最大值.
        dp[N][0] = 0;
        for (int i = 1; i <= aim; i++) {
            dp[N][i] = Integer.MAX_VALUE;
        }
        // 从下往上 从左往右 进行填表.
        for (int index = N - 1; index >= 0; index--) {
            for (int rest = 0; rest <= aim; rest++) {
                int ans = Integer.MAX_VALUE;
                for (int zhang = 0; zhang * arr[index] <= rest; zhang++) {
                    int next = dp[index+1][rest - zhang * arr[index]];
                    if (next != Integer.MAX_VALUE) {
                        ans = Math.min(ans, next + zhang);
                    }
                }
                dp[index][rest] = ans;
            }
        }
        return dp[0][aim];
    }

    //优化枚举行为
    public static int dp2(int[] arr, int aim) {
        if (aim == 0) {
            return 0;
        }
        int N = arr.length;
        int[][] dp = new int[N + 1][aim + 1];
        dp[N][0] = 0;
        for (int j = 1; j <= aim; j++) {
            dp[N][j] = Integer.MAX_VALUE;
        }
        for (int index = N - 1; index >= 0; index--) {
            for (int rest = 0; rest <= aim; rest++) {
                dp[index][rest] = dp[index + 1][rest];
                if (rest - arr[index] >= 0 && dp[index][rest - arr[index]] != Integer.MAX_VALUE) {
                    dp[index][rest] = Math.min(dp[index][rest], dp[index][rest - arr[index]] + 1);
                }
            }
        }
        return dp[0][aim];
    }
}
