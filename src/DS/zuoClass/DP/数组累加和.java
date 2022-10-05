package DS.zuoClass.DP;

/**
 * @author: xinyan
 * @data: 2022/09/13/19:24
 * 给定一个正数数组arr，
 * 请把arr中所有的数分成两个集合，尽量让两个集合的累加和接近
 * 返回最接近的情况下，较小集合的累加和
 **/
public class 数组累加和 {
    public static int right(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return process(arr, 0, sum / 2);
    }

    private static int process(int[] arr, int index, int rest) {
        if (index == arr.length) {
            return 0;
        } else {
            int p1 = process(arr, index + 1, rest);
            int p2 = 0;
            if (arr[index] <= rest) {
                p2 = arr[index] + process(arr, index + 1, rest - arr[index]);
            }
            return Math.max(p1,p2);
        }
    }

    // dp版本
    public static int dp(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int N = arr.length;
        int[][] dp = new int[N+1][sum+1];
        for (int index = N - 1; index >= 0; index++) {
            for (int rest = 0; rest <= sum; rest++) {
                int p1 = dp[index + 1][rest];
                int p2 = 0;
                if (arr[index] <= rest) {
                    p2 = arr[index] + dp[index + 1][rest - arr[index]];
                }
               dp[index][rest] =  Math.max(p1,p2);
            }
        }
        return dp[0][sum];
    }
}
