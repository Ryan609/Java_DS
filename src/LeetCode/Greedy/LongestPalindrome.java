package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/19:48
 * https://leetcode.com/problems/longest-palindrome/
 **/
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int res = 0;
        char[] chars = new char[128];

        // 从头遍历字符串, 如果是两个就设为0, 说明这俩可以组成回文, 将res+2(此时找到两个)
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] == 2) {
                res += 2;
                chars[c] = 0;
            }
        }

        // 最后res小于字符串长度说明是奇数个, 再结果上加一个1.
        if (res < s.length()) {
            return res+1;
        }
        return res;
    }
}
