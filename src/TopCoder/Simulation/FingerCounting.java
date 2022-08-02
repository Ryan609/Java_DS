package TopCoder.Simulation;

/**
 * @author: xinyan
 * @data: 2022/08/02/09:41
 **/
public class FingerCounting {
    public static void main(String[] args) {
        System.out.println(maxNumber(1,45326));
    }

    public static int maxNumber(int weakFinger, int maxCount) {
        int count = 0;
        int finger = 1;
        boolean flag = true;

        while (maxCount >= 0) {
            if (flag) {
                if (finger == weakFinger) {
                    maxCount--;
                }
                finger++;
                count++;
                if (finger == 5) {
                    flag  = false;
                }
            }
            if (!flag) {
                if (finger == weakFinger) {
                    maxCount--;
                }
                finger--;
                count++;
                if (finger == 1) {
                    flag = true;
                }
            }
        }
        return count-1;
    }
}
