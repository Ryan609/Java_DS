package LeetCode.Map_Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 存在重复元素
 * https://leetcode.cn/problems/contains-duplicate/
 * @author: xinyan
 * @data: 2022/05/21/22:04
 **/
public class Num217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) {
                int times = map.get(num);
                map.put(num,times + 1);
            } else {
                map.put(num,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() != 1) {
                return true;
            }
        }
        return false;
    }
}
