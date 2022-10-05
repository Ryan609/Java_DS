package DS.zuoClass.DP;

/**
 * @author: xinyan
 * @data: 2022/09/12/16:15
 * 给定一个二维数组matrix，一个人必须从左上角出发，最后到达右下角
 * 沿途只可以向下或者向右走，沿途的数字都累加就是距离累加和
 * 返回最小距离累加和
 **/
public class 最短路径 {
    public static int minPathSum(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        // 从右下向左上开始遍历，边界条件更好处理
        return findMinPath(grid, x - 1, y - 1);
    }

    private static int findMinPath(int[][] grid, int x, int y) {
        if (x == 0 && y == 0) {
            return grid[x][y];
        }
        if (x == 0) {
            // 到达最上侧的边，持续左移即可
            return grid[x][y] + findMinPath(grid, x ,y - 1);
        }
        if (y == 0) {
            // 到达最左侧的边，持续上移
            return grid[x][y] + findMinPath(grid, x - 1 ,y);
        }
        // 分别向左侧，上侧移动
        return grid[x][y] + Math.min(findMinPath(grid, x - 1 ,y), findMinPath(grid, x, y - 1));

    }
//    public static int minPathSum(int[][] m) {
//        return process(m, 0, 0);
//    }
//
//    private static int process(int[][] m, int x, int y) {
//        if (x == m.length - 1 && y == m[0].length-1) {
//            return m[x][y];
//        }
//        int p1 = m[x][y] + process(m, x, y + 1);
//        int p2 = m[x][y] + process(m, x+1, y);
//        return Math.min(p1,p2);
//    }


//    public static int[][] generateRandomMatrix(int rowSize, int colSize) {
//        if (rowSize < 0 || colSize < 0) {
//            return null;
//        }
//        int[][] result = new int[rowSize][colSize];
//        for (int i = 0; i != result.length; i++) {
//            for (int j = 0; j != result[0].length; j++) {
//                result[i][j] = (int) (Math.random() * 100);
//            }
//        }
//        return result;
//    }
//
//    // for test
//    public static void printMatrix(int[][] matrix) {
//        for (int i = 0; i != matrix.length; i++) {
//            for (int j = 0; j != matrix[0].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
    public static void main(String[] args) {
//        int rowSize = 10;
//        int colSize = 10;
//        int[][] m = generateRandomMatrix(rowSize, colSize);
//        System.out.println(minPathSum1(m));
        int[][] arr = {{1,3,5,9}, {8,1,3,4}, {5,0,6,1}, {8,8,4,0}};
        System.out.println(minPathSum(arr));
    }
}
