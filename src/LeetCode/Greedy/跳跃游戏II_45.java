package LeetCode.Greedy;



/**
 * @author: xinyan
 * @data: 2022/10/12/09:12
 **/
public class 跳跃游戏II_45 {

    public int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }

        int cur = 0;
        int nextLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // 下一次的最远覆盖距离
            nextLength = Math.max(nextLength, nums[i] + i);
            // 下一次最远距离可以覆盖终点, 说明再走一步就好了.
            if (nextLength >= nums.length - 1) {
                count++;
                break;
            }
            // 走到这里说明cur覆盖不到最后终点, 更新最远覆盖距离, 加一步.
            if (i == cur) {
                cur = nextLength;
                count++;
            }
        }
        return count;
    }

}
