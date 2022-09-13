package DS.DP;

/**
 * @author: xinyan
 * @data: 2022/09/12/22:03
 * 给定5个参数，N，M，row，col，k
 * 表示在N*M的区域上，醉汉Bob初始在(row,col)位置
 * Bob一共要迈出k步，且每步都会等概率向上下左右四个方向走一个单位
 * 任何时候Bob只要离开N*M的区域，就直接死亡
 * 返回k步之后，Bob还在N*M的区域的概率
 **/
public class 生还几率 {
    public static double livePosibility1(int row, int col, int k, int N, int M) {
        return process(row, col, k, N, M) / Math.pow(4, k);
    }

    // 目前在row，col位置，还有rest步要走，走完了如果还在棋盘中就获得1个生存点，返回总的生存点数
    public static long process(int row, int col, int rest, int N, int M) {
        // Bob越界了 死了 返回0
        if (row < 0 || row == N || col < 0 || col == M) {
            return 0;
        }
        // Bob没有越界, 但是剩余步数rest为0, 说明安全走完了K步, 找到一个方法 返回1.
        if (rest == 0) {
            return 1;
        }
        long up = process(row - 1, col, rest - 1, N, M);
        long down = process(row  + 1, col, rest - 1, N, M);
        long left = process(row, col - 1, rest - 1, N, M);
        long right = process(row, col + 1, rest - 1, N, M);
        return up + down + left + right;
    }

    public static void main(String[] args) {
        System.out.println(livePosibility1(6, 6, 10, 50, 50));
        // System.out.println(livePosibility2(6, 6, 10, 50, 50));
    }
}
