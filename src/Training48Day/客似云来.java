package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/08/04/09:57
 **/
public class 客似云来 {
    public static void main(String[] args) {
        long[] arr = new long[80];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 80; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            long res = 0;
            for (int i = from - 1; i <= to - 1; i++) {
                res += arr[i];
            }
            System.out.println(res);
        }
    }
}
