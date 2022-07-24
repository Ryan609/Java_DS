package Training48Day;

/**
 * @author: xinyan
 * @data: 2022/07/24/10:42
 **/
public class 年终奖 {

    public int getMost(int[][] board) {

        int row = board.length;
        int col = board[0].length;

        for(int i = 1; i < col; i++) {
            board[0][i] += board[0][i - 1];
        }

        for(int i = 1; i < row; i++) {
            board[i][0] += board[i - 1][0];
        }

        //其他情况
        for(int i = 1; i < row; i++) {
            for(int j = 1; j < col; j++) {
                board[i][j] += Math.max(board[i][j-1],board[i-1][j]);
            }
        }
        return board[row-1][col-1];
    }
}
