package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/08/01/10:27
 **/
public class 分解因数 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int numE = in.nextInt();
            int num = numE;
            int first = 0;
            String str = "";
            for (int i = 2; i <= num; i++) {
                if(num % i == 0){
                    while (num % i == 0){
                        if(first == 0){
                            str += i;
                            first++;
                        }else {
                            str += " * ";
                            str += i;
                        }
                        num /= i;
                    }
                }
            }
            System.out.println(numE +" = "+str);
        }
    }
}
