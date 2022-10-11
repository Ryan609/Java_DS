package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/15:19
 **/
public class 跳跃游戏_55 {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxLen >= i) {
                maxLen = Math.max(maxLen, i + nums[i]);
            }
            if (maxLen >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
