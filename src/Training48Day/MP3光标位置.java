package Training48Day;

import java.util.*;
/**
 * @author: xinyan
 * @data: 2022/07/21/15:56
 **/
public class MP3光标位置 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String n = sc.nextLine();
            String order = sc.nextLine();
            int num = Integer.parseInt(n);
            solve(num, order);
        }
    }

    private static void solve(int n, String orderStr) {
        int num = n;
        char[] order = orderStr.toCharArray();
        int mouse = 1;
        int first = 1;

        if(num <= 4) {
            for(int i = 0; i < order.length; i++) {
                if(mouse == 1 && order[i] == 'U') {
                    mouse = num;
                } else if(mouse == num && order[i] == 'D') {
                    mouse = 1;
                } else if(order[i] == 'U') {
                    mouse--;
                } else if(order[i] == 'D') {
                    mouse++;
                }
            }
            //打印结果
            for(int i = 1; i < num; i++) {
                System.out.print(i + " ");
            }
            System.out.println(num);
            System.out.println(mouse);

        } else  {
            for(int i = 0; i < order.length; i++) {
                if(first == 1 && mouse == 1 && order[i] == 'U') {
                    first = num - 3;
                    mouse = num;
                } else if(first == num - 3 && mouse == num && order[i] == 'D') {
                    first = 1;
                    mouse = 1;
                } else if(first != 1 && mouse == first && order[i] == 'U') {
                    first--;
                    mouse--;
                } else if(first != n - 3 && mouse == first + 3 && order[i] == 'D') {
                    first++;
                    mouse++;
                } else if(order[i] == 'U') {
                    mouse--;
                } else if(order[i] == 'D') {
                    mouse++;
                }
            }
            //打印结果
            for(int i = first; i < first + 3; i++) {
                System.out.print(i + " ");
            }
            System.out.println(first + 3);
            System.out.println(mouse);
        }
    }
}
