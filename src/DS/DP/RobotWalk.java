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
    
    public static int way(int N, int M, int K, int P) {
        if (N < 2 || M < 1 || M > N || P < 1 || P > N || K < 1) {
            return -1;
        }
        return process(N, M, K, P);
    }
    // 机器人从start开始, 可以走rest步, 需要去aim位置.
    private static int process(int N, int cur, int rest, int aim) {
        // 如果rest == 0, 说明没有步数可以走了, 查看是否到达目标位置, 如果是就返回1, 不是返回0.
        if (rest == 0) {
            return cur == aim ? 1 : 0;
        }
        // 移动范围: 1~N. 如果在最左边(1), 只能往右走
        if (cur == 1) {
            return process(N, 2, rest - 1, aim);
        }
        // 移动范围: 1~N. 如果在最右边(N), 只能往左走
        if (cur == N) {
            return process(N, N - 1, rest - 1, aim);
        }
        // 其他情况: 既可以往左走, 也可以往右走.  返回往左走的方法数 + 往右走的方法数.
        return process(N, cur - 1, rest - 1, aim) + process(N, cur + 1, rest - 1, aim);
    }

    // N个位置, M位置上(start), 必须走K步, 最终能来到P位置
    public static int dp(int N, int M, int K, int P) {
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



    //傻缓存方法
    public static int way1(int N, int M, int K, int P) {
        if (N < 2 || M < 1 || M > N || P < 1 || P > N || K < 1) {
            return -1;
        }
        int[][] dp = new int[N+1][K+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i][j] = -1;
            }
        }
        return process1(N, M, K, P, dp);
    }
    private static int process1(int N, int cur, int rest, int aim, int[][] dp) {
        // 说明当前的位置之前来过.
        if (dp[cur][rest] != -1) {
            return dp[cur][rest];
        }
        int ans = 0;
        if (rest == 0) {
            ans =  cur == aim ? 1 : 0;
        } else if (cur == 1) {
            ans =  process1(N, 2, rest - 1, aim, dp);
        } else if (cur == N) {
            ans =  process1(N, N - 1, rest - 1, aim, dp);
        } else {
            ans = process1(N, cur - 1, rest - 1, aim, dp) + process1(N, cur + 1, rest - 1, aim, dp);
        }
        dp[cur][rest] = ans;
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(dp(5, 2, 6, 4));
        System.out.println(way(5, 2, 6, 4));
        System.out.println(way1(5, 2, 6, 4));
    }
}
