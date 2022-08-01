package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/31/19:36
 * https://www.nowcoder.com/questionTerminal/9f6b8f6ec26d44cfb8fc8c664b0edb6b
 **/
public class 最难的问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == ' ') {
                    sb.append(" ");
                } else {
                    sb.append((char)(c>'E' ? c-5 : c+21));
                }
            }
            System.out.println(sb);
        }
    }
}
