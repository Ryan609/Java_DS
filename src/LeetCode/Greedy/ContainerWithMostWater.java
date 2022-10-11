package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/20:43
 **/
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;

        while (left < right) {
            int length = right - left;
            int count = 0;

            if (height[left] < height[right]) {
                count = height[left] * length;
                res = Math.max(res, count);
                left++;
            } else {
                count = height[right] * length;
                res = Math.max(res, count);
                right--;
            }
        }
        return res;
    }
}
