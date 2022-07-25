package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/25/09:20
 **/
public class 星际密码 {
    public static void main(String[] args) {
        int[] nums = new int[10001];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        for(int i = 3; i < 10001; i++) {
            nums[i] = nums[i-1]+nums[i-2];
            nums[i] = nums[i] % 10000;
        }

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int result = nums[x];
                sb.append(String.format("%04d", result));
            }
            System.out.println(sb);
        }
    }
}
