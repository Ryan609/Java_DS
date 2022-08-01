package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/01/15:01
 **/
public class AimToTen {

    public static void main(String[] args) {
        int[] arr = {9, 10, 10, 9};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {10, 10, 10, 10};
        System.out.println(need(arr));
        System.out.println(need(arr1));
        System.out.println(need(arr2));
    }

    public static int need(int[] marks) {
        int count = 0;
        double sum = 0;
        double avargeMark = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        avargeMark = sum / marks.length;

        if (avargeMark >= 9.5) {
            return 0;
        }

        while (avargeMark < 9.5) {
            sum = sum + 10;
            count++;
            avargeMark = sum / (marks.length + count);
        }
        return count;
    }
}
