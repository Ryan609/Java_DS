package LeetCode.Map_Set;

import java.util.HashMap;
import java.util.Map;

/**
 * 单词规律
 * https://leetcode.cn/problems/word-pattern/
 * @author: xinyan
 * @data: 2022/05/21/16:17
 **/
public class Num290 {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }

        int count = 1;
        HashMap<String,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String i : str) {
            if (map.containsKey(i)) {
                sb.append(map.get(i));
            } else {
                map.put(i,count);
                sb.append(count);
                count++;
            }
        }

        int count1 = 1;
        HashMap<Character,Integer> map1 = new HashMap<>();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map1.containsKey(c)) {
                sb1.append(map1.get(c));
            } else {
                map1.put(c,count1);
                sb1.append(count1);
                count1++;
            }
        }

        return sb.toString().equals(sb1.toString());
    }
}
