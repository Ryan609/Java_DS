package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/22:14
 **/
public class MaximumSubarray_53 {

    // 纯暴力
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) { // 设置起始位置
            count = 0;
            for (int j = i; j < nums.length; j++) { // 每次从起始位置i开始遍历寻找最大值
                count += nums[j];
                result = count > result ? count : result;
            }
        }
        return result;
    }

    public int maxSubArray1(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > result) {
                result = count;
            }
            if (count <= 0) {
                count = 0;
            }
        }
        return result;
    }

}
