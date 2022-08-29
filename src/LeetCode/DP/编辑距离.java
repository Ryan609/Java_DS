package LeetCode.DP;

/**
 * @author: xinyan
 * @data: 2022/08/26/12:07
 * https://leetcode.cn/problems/edit-distance/
 **/
public class 编辑距离 {
    public int minDistance(String word1, String word2) {

        int[][] f = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i < f.length; i++) f[i][0] = i;
        for (int i = 0; i < f[0].length; i++) f[0][i] = i;

        for (int i = 1; i < f.length; i++)
            for (int j = 1; j < f[0].length; j++)
                f[i][j] = word1.charAt(i-1) == word2.charAt(j-1) ? f[i-1][j-1] : Math.min(f[i-1][j-1], Math.min(f[i][j-1], f[i-1][j])) + 1;

        return f[word1.length()][word2.length()];
    }
}
