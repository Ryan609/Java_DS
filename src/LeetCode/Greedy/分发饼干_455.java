package LeetCode.Greedy;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/10/11/10:37
 * https://leetcode.cn/problems/assign-cookies/description/
 **/
public class 分发饼干_455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int j = 0;
        for (int i = 0; i < s.length && j < g.length; i++) {
            if (g[j] <= s[i]) {
                j++;
                res++;
            }
        }
        return res;
    }
}
