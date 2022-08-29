package TopCoder.BruteForce;

/**
 * @author: xinyan
 * @data: 2022/08/17/10:24
 **/
public class PalindromePrime {
    public static void main(String[] args) {
        System.out.println(count(442,928));
    }

    public static int count(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (sushu(i) == 1) {
                if (i / 100 == 0) {
                    if (i < 10) {
                        if (sushu(i) == 1) {
                            count++;
                        }
                    }
                    if (i/10 == i%10) {
                        count++;
                    }
                } else {
                    if (i/100 == i%10) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int sushu(int a) {
        if (a <= 1) {
            return 0;
        }
        if (a == 2) {
            return 1;
        }
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                return 0;
            }
        }
        return 1;
    }
}
