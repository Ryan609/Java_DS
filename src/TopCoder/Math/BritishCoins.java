package TopCoder.Math;

import java.util.Arrays;

/**
 * @author: xinyan
 * @data: 2022/08/03/12:06
 **/
public class BritishCoins {
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(coins(533)));
//        System.out.println(Arrays.toString(coins(0)));
//        System.out.println(Arrays.toString(coins(6)));
//        System.out.println(Arrays.toString(coins(4091)));
//        System.out.println(Arrays.toString(coins(10000)));
//
//        System.out.println(Arrays.toString(coins(72)));
//        System.out.println(Arrays.toString(coins(2400)));
//        System.out.println(Arrays.toString(coins(504)));
//        System.out.println(Arrays.toString(coins(61)));
//        System.out.println(Arrays.toString(coins(76)));
//        System.out.println(Arrays.toString(coins(669)));
//        System.out.println(Arrays.toString(coins(889)));
//        System.out.println(Arrays.toString(coins(1201)));
//        System.out.println(Arrays.toString(coins(1303)));
//        System.out.println(Arrays.toString(coins(1363)));
//    }

    // 12 pennies = 1 shilling
    // 20 Shilling = 1 pound
    // so 1 pound = 12*20(240) pennies
    public static int[] coins(int pence) {
        int[] arr = new int[3];
        int pound;
        int shilling;
        int pennies = pence;

        pound = pennies / 240;
        arr[0] =  (int) Math.floor(pound);
        pennies = pennies - arr[0]*240;
        if (pennies >= 12) {
            shilling = pennies / 12;
            arr[1] =  (int) Math.floor(shilling);
            pennies = pennies - arr[1]*12;
            arr[2] = pennies;
        } else {
            arr[1] = 0;
            arr[2] = pennies;
        }
        return arr;
    }
}
