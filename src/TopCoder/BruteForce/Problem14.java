package TopCoder.BruteForce;

/**
 * @author: xinyan
 * @data: 2022/08/17/09:28
 **/
public class Problem14 {
    public static long getLength(int num) {
        long len = 0;
        for (long i = num; i >= 1;) {
            len++;
            if (i == 1) {
                break;
            }
            if (i % 2 == 0) {
                i = i/2;
            } else {
                i = (3*i)+1;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        long maxLengeht = 0;
        int maxNum = 0;
        for (int i  = 1; i <= 1000000; i++) {
            long num = getLength(i);
            if (maxLengeht < num) {
                maxNum = i;
                maxLengeht = num;
            }
        }
        System.out.println(maxNum);
    }
}
