package Training48Day;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/26/10:14
 * https://www.nowcoder.com/questionTerminal/82424d93369649b98720743c25edc6ce?toCommentId=8737333
 **/
public class 快到碗里来 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            BigDecimal a = sc.nextBigDecimal();
            BigDecimal b = sc.nextBigDecimal();
            BigDecimal len = new BigDecimal("6.28").multiply(b);
            if(a.compareTo(len) == -1 || a.compareTo(len) == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
