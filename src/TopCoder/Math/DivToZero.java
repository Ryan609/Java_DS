package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/02/14:54
 **/
public class DivToZero {

    public static void main(String[] args) {
        System.out.println(lastTwo(7838392,87));
    }

    public static String lastTwo(int num, int factor) {
        num = (num / 100) * 100;
        String str = "";
        int res = 0;
        for (int i = 0; i < 100; i++) {
            if ((num + i) % factor == 0) {
                res = i;
                break;
            }
        }
        str = String.format("%02d",res);
        return str;
    }
}
