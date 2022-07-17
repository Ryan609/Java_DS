package Training48Day;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/questionTerminal/1221ec77125d4370833fd3ad5ba72395
 * @author: xinyan
 * @data: 2022/07/17/14:29
 **/
public class 统计每个月兔子总数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(rabbit(num));
    }

    private static int rabbit(int number) {
        if(number == 1 || number == 2) {
            return 1;
        }
        return rabbit(number-1) + rabbit(number-2);
    }
}
