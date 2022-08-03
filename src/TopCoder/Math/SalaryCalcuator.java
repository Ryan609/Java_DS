package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/03/09:53
 **/
public class SalaryCalcuator {
    public static void main(String[] args) {
        System.out.println(calcHours(10,15,1000));
        System.out.println(calcHours(10,15,3000));
        System.out.println(calcHours(100,1,1000000));
        System.out.println(calcHours(17,23,973546));
        System.out.println(calcHours(82,8,12140));
    }

    public static double calcHours(int P1, int P2, int salary) {
        int test = P1*200;
        double time = 0.0;
        if (salary <= test) {
            time = (double) salary / P1;
        } else {
            int temp = salary - test;
            time = (double) temp / P2 + 200;
        }
        return time;
    }
}
