package Training48Day;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/08/08/10:01
 **/
public class mkdir {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] str = new String[n];
            for(int i = 0; i < n; i++){
                str[i] = sc.nextLine();
            }
            // 排序以达到按照字典顺序
            Arrays.sort(str);
            for(int i = 1; i < n; i++){
                // 排完序后最接近的字符串就会相邻
                // 若后者是在前者的路径之后延伸（即为/a/ab和/a/ab/abc的关系）
                // 就将前者变为""以便后续打印时判断，需要注意（/a/ab和/a/abc）这种情况
                if(str[i].contains(str[i-1]) && str[i].charAt(str[i-1].length()) == '/'){
                    str[i-1] = "";
                }
            }
            for(int i = 0; i < n; i++){
                if(!"".equals(str[i])){
                    System.out.println("mkdir -p "+str[i]);
                }
            }
            System.out.println();
        }
    }
}
