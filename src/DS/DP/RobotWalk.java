package DS.DP;

/**
 * @author: xinyan
 * @data: 2022/09/08/21:59
 * 假设有排成一行的N个位置记为1~N，N一定大于或等于2
 * 开始时机器人在其中的M位置上(M一定是1~N中的一个)
 * 如果机器人来到1位置，那么下一步只能往右来到2位置；
 * 如果机器人来到N位置，那么下一步只能往左来到N-1位置；
 * 如果机器人来到中间位置，那么下一步可以往左走或者往右走；
 * 规定机器人必须走K步，最终能来到P位置(P也是1~N中的一个)的方法有多少种
 * 给定四个参数 N、M、K、P，返回方法数
 **/
public class RobotWalk {

    // N个位置, M位置上(start), 必须走K步, 最终能来到P位置
    public static int ways(int N, int M, int K, int P) {
        int[][] dp = new int[N+1][K+1];
        dp[P][0] = 1;
        for (int rest = 1; rest <= K; rest++) {
            dp[1][rest] = dp[2][rest-1];
            for (int cur = 2; cur < N; cur++) {
                dp[cur][rest] = dp[cur-1][rest-1] + dp[cur+1][rest-1];
            }
            dp[N][rest] = dp[N - 1][rest-1];
        }
        return dp[M][K];
    }

    public static void main(String[] args) {
        System.out.println(ways(5, 2, 6, 4));
    }
}
