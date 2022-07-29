package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/29/09:27
 * https://www.nowcoder.com/questionTerminal/1d18c0841e64454cbc3afaea05e2f63c
 **/
public class 有假币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int count = 0;
            while (n >= 2) {
                n = (int) Math.ceil((double) n/3);
                count++;
            }
            System.out.println(count);
        }
    }
}
