package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/31/20:11
 * https://www.nowcoder.com/questionTerminal/e8fb8f89f5d147ec92fd8ecfefe89b0d
 **/
public class 因子个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            for(int i = 2; i < Math.sqrt(n); i++) {
                if(n%i == 0) {
                    while(n%i == 0) {
                        n /= i;
                    }
                    count++;
                }
            }
            if(n != 1) count++;
            System.out.println(count);
        }
    }
}
