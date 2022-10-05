package DS.zuoClass.异或;

/**
 * @author: xinyan
 * @data: 2022/09/26/09:31
 **/
public class EvenTimesOddTimes {

    // 题目一: arr中，只有一种数，出现奇数次
    public static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
    }

    // 题目二: arr中，有两种数，出现奇数次
    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        // a 和 b是两种数
        // eor != 0
        // eor最右侧的1，提取出来
        // eor :     00110010110111000
        // rightOne :00000000000001000
        int rightOne = eor & (-eor); // 提取出最右的1

        int onlyOne = 0; // eor'
        for (int i = 0 ; i < arr.length;i++) {
            //  arr[1] =  111100011110000
            // rightOne=  000000000010000
            if ((arr[i] & rightOne) != 0) {
                onlyOne ^= arr[i];
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }


    // 题目三: arr中，找出 出现K次的数, 其他都出现M次
    public static int onlyKTimes(int[] arr, int k, int m) {
        int[] help = new int[32];

        // 将每个数在32上每一位出现1的次数做出统计
        for (int num : arr) {
            for (int i = 0; i <= 31; i++) {
                help[i] += (num >> i) & 1;
            }
        }
        // 判断第i位的1的总数是否是m的整数倍, 如果不是 说明出现k次数在这个位置一定有1
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (help[i] % m != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
//        int[] arr = {2,2,3,1,1,3,4,4,5,5,10,10};
//        printOddTimesNum1(arr);
        int n = 10;
        int n1 = 4;
        int eor = n^n1;
        int one = eor & (-eor);
        System.out.println(one);
    }
}
