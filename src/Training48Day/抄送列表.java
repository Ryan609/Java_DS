package Training48Day;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: xinyan
 * @data: 2022/08/06/10:24
 * https://www.nowcoder.com/questionTerminal/286af664b17243deb745f69138f8a800?orderByHotValue=0&commentTags=Java&toCommentId=930669
 **/
public class 抄送列表 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            Set<String> set = new HashSet<>();
            String str = in.nextLine();
            int len = str.length();
            int i = 0;
            int end = 0;
            while(i < len) {
                if('\"' == str.charAt(i)) {
                    end = str.indexOf('\"' , i+1);//找寻第二个双引号
                    set.add(str.substring(i+1,end));//去除双引号的数据放入set中
                    i = end + 2;
                }else {
                    end = str.indexOf(",",i+1);
                    if(end == -1) {//额外判断最后一个的情况
                        set.add(str.substring(i,len));
                        break;
                    }
                    //str.substring(i,end);
                    set.add(str.substring(i,end));
                    i = end + 1;
                }
            }
            String name = in.nextLine();
            if(set.contains(name)) {
                System.out.println("Ignore");
            }else {
                System.out.println("Important!");
            }
        }
    }
}
