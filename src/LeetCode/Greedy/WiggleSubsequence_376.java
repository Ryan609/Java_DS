package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/21:26
 **/
public class WiggleSubsequence_376 {

    public int wiggleMaxLength(int[] nums) {
        int cur = 0;
        int pre = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            cur = nums[i+1] - nums[i];
            if ((cur > 0 && pre <=0) || (cur < 0 && pre >= 0)) {
                count++;
                pre = cur;
            }
        }
        return count;
    }

}
