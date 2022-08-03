package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/02/15:27
 **/
public class TemperatureScales {

    public static void main(String[] args) {
        System.out.println(convert(0,100,0,100,28));
        System.out.println(convert(0,100,1,101,28));

    }

    public static double convert(int f1, int b1, int f2, int b2, int t) {

        return (t-f1)*1.0*(b2-f2)*1.0/(b1-f1) + f2;
    }
}
