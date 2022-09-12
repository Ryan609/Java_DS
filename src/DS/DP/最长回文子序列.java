package DS.DP;

/**
 * @author: xinyan
 * @data: 2022/09/11/15:57
 * https://leetcode.cn/problems/longest-palindromic-subsequence/submissions/
 * 给定一个字符串str，返回这个字符串的最长回文子序列长度
 * 比如 ： str = “a12b3c43def2ghi1kpm”
 * 最长回文子序列是“1234321”或者“123c321”，返回长度7
 **/
public class 最长回文子序列 {

    public int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] cha = s.toCharArray();
        return process(cha, 0, cha.length-1);
    }

    private static int process(char[] chars, int L, int R) {
        if (L == R) {
            return 1;
        }
        if (L == R - 1) {
            return chars[L] == chars[R] ? 2 : 1;
        }
        // 四种情况: 1. L要 R要    2. L不要 R要   3. L要  R不要    4. L不要 R不要
        int p1 = process(chars, L + 1, R - 1);
        int p2 = process(chars, L + 1, R);
        int p3 = process(chars, L, R - 1);
        int p4 = chars[L] == chars[R] ? (2 + process(chars, L + 1, R - 1)) : 0;
        return Math.max(Math.max(p1,p2), Math.max(p3, p4));
    }

    public int longestPalindromeSubseq1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] cha = s.toCharArray();
        int N = cha.length;
        int[][] dp = new int[N][N];
        dp[N-1][N-1] = 1;
        for (int i = 0; i < N - 1; i++) {
            dp[i][i] = 1;
            dp[i][i+1] = cha[i] == cha[i+1] ? 2 : 1;
        }
        for (int L = N - 3; L >= 0; L--) {
            for (int R = L + 2; R  < N; R++) {

                int p1 = dp[L + 1][R - 1];
                int p2 = dp[L + 1][R];
                int p3 = dp[L][R - 1];
                int p4 = cha[L] == cha[R] ? (2 + dp[L + 1][R - 1]) : 0;
                dp[L][R] = Math.max(Math.max(p1,p2), Math.max(p3, p4));
            }
        }
        return dp[0][N-1];
    }


    public int longestPalindromeSubseq2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] cha = s.toCharArray();
        int N = cha.length;
        int[][] dp = new int[N][N];
        dp[N-1][N-1] = 1;
        for (int i = 0; i < N - 1; i++) {
            dp[i][i] = 1;
            dp[i][i+1] = cha[i] == cha[i+1] ? 2 : 1;
        }
        for (int L = N - 3; L >= 0; L--) {
            for (int R = L + 2; R  < N; R++) {
                dp[L][R] = Math.max(dp[L + 1][R], dp[L][R - 1]);
                if (cha[L] == cha[R]) {
                    dp[L][R] = Math.max(dp[L][R], (2 + dp[L + 1][R - 1]));
                }
            }
        }
        return dp[0][N-1];
    }

}
