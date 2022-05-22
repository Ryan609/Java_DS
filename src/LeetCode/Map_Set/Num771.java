package LeetCode.Map_Set;

import java.util.HashSet;
import java.util.Set;

/**
 * 宝石与石头
 * https://leetcode.cn/problems/jewels-and-stones/
 * @author: xinyan
 * @data: 2022/05/21/21:05
 **/
public class Num771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int ret = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                ret++;
            }
        }
        return ret;
    }
}
