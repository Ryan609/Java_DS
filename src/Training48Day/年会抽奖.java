package Training48Day;

import jdk.nashorn.internal.ir.SplitReturn;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/08/06/09:28
 * https://www.nowcoder.com/questionTerminal/610e6c0387a0401fb96675f58cda8559
 **/
public class 年会抽奖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            double num1 = count(n);
            double num2 = num(n);
            DecimalFormat df = new DecimalFormat("0.00%");
            String res = df.format(num1/num2);
            System.out.println(res);
        }
    }

    private static double count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n -1) + count(n - 2));
        }
    }

    private static double num(int n ) {
        if (n == 0 ||n == 1) {
            return 1;
        }
        return n * num(n-1);
    }
}
