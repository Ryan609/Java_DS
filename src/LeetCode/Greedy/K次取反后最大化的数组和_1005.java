package LeetCode.Greedy;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/10/12/09:50
 **/
public class K次取反后最大化的数组和_1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {
        // 首先按照绝对值从小到大排序.
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (Math.abs(nums[j]) > Math.abs(nums[j+1])) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        // 从后往前遍历, 因为负数越小 他的绝对值就越大, 先将绝对值最大的负数变为正数.
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
            if (k == 0) {
                break;
            }
        }
        // k没有用完, 就来回反转最小数
        if (k != 0) {
            while (k != 0) {
                nums[0] = - nums[0];
                k--;
            }
        }
        // 计算相加结果并返回
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        return count;
    }
}
