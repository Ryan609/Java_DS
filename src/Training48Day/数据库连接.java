package Training48Day;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: xinyan
 * @data: 2022/08/08/09:29
 **/
public class 数据库连接 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int max = 0;
            Set<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String id = sc.next();
                String op = sc.next();
                if (op.equals("connect")){
                    set.add(id);
                    max = Math.max(max, set.size());
                } else {
                    set.remove(id);
                }
            }
            System.out.println(max);
        }

    }
}
