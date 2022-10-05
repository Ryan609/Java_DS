package DS.zuoClass.DP;

/**
 * @author: xinyan
 * @data: 2022/09/09/20:15
 * 给定一个整型数组arr，代表数值不同的纸牌排成一条线
 * 玩家A和玩家B依次拿走每张纸牌
 * 规定玩家A先拿，玩家B后拿
 * 但是每个玩家每次只能拿走最左或最右的纸牌
 * 玩家A和玩家B都绝顶聪明
 * 请返回最后获胜者的分数
 **/
public class CardsInLine {

    public static int way(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int p1 = f(arr, 0, arr.length - 1);
        int p2 = g(arr, 0, arr.length - 1);
        return Math.max(p1,p2);
    }
    // 先手函数
    public static int f(int[] arr, int L, int R) {
        // 说明没有牌了, 直接拿走
        if (L == R) {
            return arr[L];
        }
        // 说明还有牌, 从左拿和从右拿选最大.
        int p1 = arr[L] + g(arr, L + 1, R);  // 选择拿左边的, 那么下次就是后手从L+1开始
        int p2 = arr[R] + g(arr, L, R - 1); // 选择拿右边的, 那么下次就是后手从R-1开始
        return Math.max(p1,p2);
    }
    // 后手函数
    public static int g(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        int p1 = f(arr, L + 1, R);
        int p2 = f(arr, L,R - 1);
        return Math.min(p1,p2);
    }

    // dp改进
    public static int dp(int[] arr) {
        int N = arr.length;
        int[][] fmap = new int[N][N];
        int[][] gmap = new int[N][N];
        for (int i = 0; i < N; i++) {
            fmap[i][i] = arr[i];
        }
        for (int startCol = 1; startCol < N; startCol++) {
            int L = 0;
            int R = startCol;
            while (R < N) {
                fmap[L][R] = Math.max(arr[L] + gmap[L+1][R], arr[R]+gmap[L][R-1]);
                gmap[L][R] = Math.min(fmap[L+1][R], fmap[L][R-1]);
                L++;
                R++;
            }
        }
        return Math.max(fmap[0][N-1], gmap[0][N-1]);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,4,5,8,1,6,0,3,4,6,1,7};
        System.out.println(dp(arr));
        System.out.println(way(arr));
    }
}
