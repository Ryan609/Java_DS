package nowCoder;

/**
 * @author: xinyan
 * @data: 2022/08/29/16:30
 * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?
 **/
public class 二维数组的查找 {
    public boolean Find(int target, int [][] array) {
        if(array == null) {
            return false;
        }
        int i = 0;
        int j = array[0].length-1;

        while (i < array.length && j >= 0) {
            if (target < array[i][j]) {
                j--;
            } else if (target > array[i][j]) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
