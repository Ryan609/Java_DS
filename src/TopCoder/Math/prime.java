package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/08/17:41
 **/
public class prime {
        public static void main(String[] args) {
            boolean isFlag = true;
            int count = 0;
            for(int i = 2;i <= 10000000;i++){
                for(int j = 2;j <= Math.sqrt(i);j++){
                    if(i % j == 0){
                        isFlag = false;
                        break;
                    }
                }
                if(isFlag == true){
                    count++;
                    if (count == 10001) {
                        System.out.println(i);
                    }
                }
                isFlag = true;
            }
        }

}



