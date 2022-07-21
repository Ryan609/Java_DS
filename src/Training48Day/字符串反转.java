package Training48Day;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: xinyan
 * @data: 2022/07/20/14:56
 **/
public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                stack.add(str.charAt(i));
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(stack.pop());
            }
            System.out.println(sb);
        }
    }
}
