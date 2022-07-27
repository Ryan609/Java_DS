package Training48Day;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/27/09:47
 * https://www.nowcoder.com/questionTerminal/c67a09062c0f4a5b964eef0945d3dd06
 **/
public class 三角形 {
    /**
     * 解题思路: 题目要求输入数字范围为(1≤a, b, c≤10^100), 所以需要使用BigDecimal来进行接收.
     * 组成三角形的条件是 任意两边之和大于第三边.
     * 所以: 使用BigDecimal的add方法将两数相加, 再用compareTo方法对两数进行比较.
     * 如果相等返回0, 小于返回-1, 大于返回0.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            BigDecimal a = sc.nextBigDecimal();
            BigDecimal b = sc.nextBigDecimal();
            BigDecimal c = sc.nextBigDecimal();

            if(a.add(b).compareTo(c) > 0 && a.add(c).compareTo(b)>0 && b.add(c).compareTo(a)>0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
