package LeetCode.Map_Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 * https://leetcode.cn/problems/first-unique-character-in-a-string/
 * @author: xinyan
 * @data: 2022/05/22/14:51
 **/
public class Num387 {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int times = map.get(c);
                map.put(c,times + 1);
            } else {
                map.put(c,1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
