package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/22/15:33
 **/
public class 小易升级打怪 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] power = new int[n];
            for(int i = 0; i < n; i++) {
                power[i] = sc.nextInt();
            }
            for(int i = 0; i < power.length; i++) {
                if(c > power[i]) {
                    c += power[i];
                }else {
                    c += getN(c, power[i]);
                }
            }
            System.out.println(c);
        }
    }

    private static int getN(int a, int b) {
        if(b == 0) {
            return a;
        }
        int r = a%b;
        return getN(b,r);
    }
}
