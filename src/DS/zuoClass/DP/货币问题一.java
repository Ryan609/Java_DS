package DS.zuoClass.DP;

/**
 * @author: xinyan
 * @data: 2022/09/12/20:02
 * arr是货币数组，其中的值都是正数。再给定一个正数aim。
 * 每个值都认为是一张货币，
 * 即便是值相同的货币也认为每一张都是不同的，
 * 返回组成aim的方法数
 * 例如：arr = {1,1,1}，aim = 2
 * 第0个和第1个能组成2，第1个和第2个能组成2，第0个和第2个能组成2
 * 一共就3种方法，所以返回3
 **/

public class 货币问题一 {
    public static int way(int[] arr, int aim) {
        return process(arr, 0, aim);
    }

    private static int process(int[] arr, int index, int rest) {
        if (rest < 0) {
            return 0;
        }
        if (index == arr.length) {
            return rest == 0 ? 1 : 0;
        } else {
            return process(arr, index + 1, rest) + process(arr, index + 1, rest - arr[index]);
        }
    }
}
