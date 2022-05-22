package LeetCode.Map_Set;

import java.util.HashSet;

/**
 *  存在重复元素 II
 *  https://leetcode.cn/problems/contains-duplicate-ii/
 * @author: xinyan
 * @data: 2022/05/22/14:31
 **/
public class Num219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
