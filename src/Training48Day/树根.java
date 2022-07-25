package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/25/09:56
 **/
public class 树根 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            while(str.length() > 1) {
                int n = 0;
                for(int i = 0; i < str.length(); i++) {
                    n += str.charAt(i) - '0';
                }
                str = String.valueOf(n);
            }
            System.out.println(str);
        }
    }
}
