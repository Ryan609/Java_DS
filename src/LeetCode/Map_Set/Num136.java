package LeetCode.Map_Set;

import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数字
 * https://leetcode.cn/problems/single-number/
 * @author: xinyan
 * @data: 2022/05/21/09:50
 **/
public class Num136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) {
                int times = map.get(num);
                map.put(num,times + 1);
            } else {
                map.put(num,1);
            }
        }
        int ret = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                ret = entry.getKey();
            }
        }
        return ret;
    }
}
