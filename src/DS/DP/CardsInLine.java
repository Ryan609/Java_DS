package DS.DP;

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
        System.out.println(way(arr));
    }
}
