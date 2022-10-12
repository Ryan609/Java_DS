package codetest;



import java.util.*;

public class test {
    public static void main(String[] args) {
        boolean[][] arr = {{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false}};
        markDiagonal(arr, 0,0);
        for (int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
            //遍历二维数组的每个元素(元素)
            //1.arr[i] 表示二维数组的第一个元素，二维数组每个元素又是一个一维数组
            //2.arr[i].length 得到二维数组每个一维数组的长度
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//换行
        }
    }


    public static void markDiagonal(boolean[][] board, int row, int col) {
        int r = row - Math.min(row, col);
        int c = col - Math.min(row, col);
        while (r < board.length && c < board.length) {
            board[r][c] = true;
            r++;
            c++;
        }
        r = row - Math.min(row, board.length - 1 - col);
        c = col + Math.min(row, board.length - 1 - col);
        while (r < board.length && c >= 0) {
            board[r][c] = true;
            r++;
            c--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSub(String s1, String s2) {
        if (null == s2 || null == s1) {
            return false;
        }
        if (s1.length() < s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                int j = i+1;
                int k = 1;
                while (j < s1.length() && k < s2.length() && s1.charAt(j) == s2.charAt(k)) {
                    j++;
                    k++;
                }
                if (k == s2.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}