package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/28/10:33
 **/
public class 老猴子分桃 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            long a = (long) Math.pow(5, n) - 4;
            long b = (long) Math.pow(4, n) + n - 4;
            System.out.println(a + " " + b);
        }
    }
}
