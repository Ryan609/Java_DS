package TopCoder.Graph;

/**
 * @author: xinyan
 * @data: 2022/10/26/13:06
 **/
public class MatrixSwap {
    public int swapNum(int M, int N) {
        int[] all = new int[M * N];
        int swap = 0;
        for (int i = 0; i < all.length; i++) {
            int col = i / N;
            int row = i % N;
            all[i] = row * M + col;
        }
        for (int i = 0; i < all.length; i++) {
            if (all[i] == i) continue;
            int idx = i;
            while (all[idx] != i) idx++;
            all[idx] = all[i];
            swap++;
        }
        return swap;
    }

    public static void main(String[] args) {
        MatrixSwap matrixSwap = new MatrixSwap();
//        System.out.println(matrixSwap.swapNum(3,3));
        System.out.println(matrixSwap.swapNum(2,3));
//        System.out.println(matrixSwap.swapNum(3,5));
//        System.out.println(matrixSwap.swapNum(50,50));
//        System.out.println(matrixSwap.swapNum(49,51));
//        System.out.println(matrixSwap.swapNum(100,100));
    }
}
