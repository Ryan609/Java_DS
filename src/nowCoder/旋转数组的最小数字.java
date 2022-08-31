package nowCoder;

/**
 * @author: xinyan
 * @data: 2022/08/29/16:55
 * https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?
 **/
public class 旋转数组的最小数字 {

    // 方法一: 遍历(不推荐)
//    public int minNumberInRotateArray(int [] array) {
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        return min;
//    }

    // 方法二: 二分(推荐)
//    public int minNumberInRotateArray(int [] array) {
//        if (array == null || array.length == 0 ) {
//            return 0;
//        }
//        int left = 0;
//        int right = array.length - 1;
//        int mid = 0;
//
//        while (left < right) {
//            if (right - left == 1) {
//                mid = right;
//                break;
//            }
//            mid = (right - left) / 2;
//            if (array[left] == array[right] && array[left] == array[mid]) {
//                int result = array[left];
//                for (int i = left+1; i < right; i++) {
//                    if (result > array[i]) {
//                        result = array[i];
//                    }
//                }
//                return result;
//            }
//            if (array[mid] >= array[left]) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//        }
//        return array[mid];
//    }


    public static int minNumberInRotateArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            //最小的数字在mid右边
            if(array[mid] > array[right])
                left = mid + 1;
                //无法判断，一个一个试
            else if(array[mid] == array[right])
                right--;
                //最小数字要么是mid要么在mid左边
            else
                right = mid;
        }
        return array[left];
    }
}
