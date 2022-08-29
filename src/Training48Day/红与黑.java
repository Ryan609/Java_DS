package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/08/10/15:18
 **/
public class 红与黑 {

    static int count = 0;
    static int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            char[][] map = new char[m][n];

            int x = 0;
            int y = 0;
            for (int i = 0; i < m; i++) {
                String str = sc.next();
                for (int j = 0; j < n; j++) {
                    map[i][j] = str.charAt(j);
                    if (map[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }
            count = 0;
            dfs(map, m, n, x, y);
            System.out.println(count);
        }
    }

    private static void dfs(char[][] map, int m, int n, int x, int y) {
        if (map[x][y] == '#') {
            return;
        }
        count++;
        map[x][y] = '#';
        for (int i = 0; i < 4; i++) {
            int nx = x + direct[i][0];
            int ny = y + direct[i][1];
            if (nx >= 0 && nx < m && ny >=0 && ny < n) {
                dfs(map, m, n, nx, ny);
            }
        }
    }
}
