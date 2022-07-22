package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/22/15:33
 **/
public class 找出字符串中只出现一次的字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();

            int[] arr = new int[128];
            char[] c = str.toCharArray();

            for(int i = 0; i < c.length; i++){
                arr[c[i]]++;
            }

            boolean boo = false;
            for(int i = 0; i < c.length; i++) {
                if(arr[c[i]] == 1) {
                    boo = true;
                    System.out.println(c[i]);
                    break;
                }
            }
            if(!boo) {
                System.out.println(-1);
            }
        }
    }
}
