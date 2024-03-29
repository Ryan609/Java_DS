package DS.zuoClass.DP;

/**
 * @author: xinyan
 * @data: 2022/09/11/21:05
 * 请同学们自行搜索或者想象一个象棋的棋盘，
 * 然后把整个棋盘放入第一象限，棋盘的最左下角是(0,0)位置
 * 那么整个棋盘就是横坐标上9条线、纵坐标上10条线的区域
 * 给你三个 参数 x，y，k
 * 返回“马”从(0,0)位置出发，必须走k步
 * 最后落在(x,y)上的方法数有多少种?
 **/
public class 象棋步数 {
    public static int jump(int a, int b, int k) {
        return process(0, 0, k, a, b);
    }

    private static int process(int x, int y, int k, int a, int b) {
        if (x < 0 || x > 9 || y < 0 || y > 8) {
            return 0;
        }
        if (k == 0) {
            return (x == a && y == b) ? 1 : 0;
        }
        int way = process(x+2, y+1, k-1, a,b);
        way += process(x+1, y+2, k-1, a,b);
        way += process(x-1, y+2, k-1, a,b);
        way += process(x-2, y+1, k-1, a,b);
        way += process(x-2, y-1, k-1, a,b);
        way += process(x-1, y-2, k-1, a,b);
        way += process(x+1, y-2, k-1, a,b);
        way += process(x+2, y-1, k-1, a,b);

        return way;
    }

    public static void main(String[] args) {
        int x = 7;
        int y = 7;
        int step = 10;
//        System.out.println(ways(x, y, step));
//        System.out.println(dp(x, y, step));

        System.out.println(jump(x, y, step));
    }
}
