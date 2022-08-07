package TopCoder.BruteForce;

/**
 * @author: xinyan
 * @data: 2022/08/04/18:10
 **/
public class CheckFunction {

    public static void main(String[] args) {
        System.out.println(newFunction("13579"));
        System.out.println(newFunction("02468"));
        System.out.println(newFunction("73254370932875002027963295052175"));
    }

    public static int newFunction(String code) {
        char[] arr = code.toCharArray();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] == '0') {
                 res += 6;
             } else if (arr[i] == '1') {
                 res += 2;
             } else if (arr[i] == '2') {
                 res += 5;
             } else if (arr[i] == '3') {
                 res += 5;
             } else if (arr[i] == '4') {
                 res += 4;
             } else if (arr[i] == '5') {
                 res += 5;
             } else if (arr[i] == '6') {
                 res += 6;
             } else if (arr[i] == '7') {
                 res += 3;
             } else if (arr[i] == '8') {
                 res += 7;
             } else if (arr[i] == '9') {
                 res += 6;
             }
        }
        return res;
    }
}
