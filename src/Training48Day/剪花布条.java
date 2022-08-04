package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/08/04/09:50
 **/
public class 剪花布条 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            int res = 0;
            while(arr[0].contains(arr[1])) {
                arr[0] = arr[0].replaceFirst(arr[1],"");
                res++;
            }
            System.out.println(res);
        }
    }
}
