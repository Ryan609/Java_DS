package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/07/27/15:12
 **/
public class HockeyPlayoff {
    public static void main(String[] args) {
        System.out.println(winProbability(3,0,100));
        System.out.println(winProbability(4,100,0));
    }

    public static int winProbability(int winsNeeded, int AwinHome, int BwinHome) {
        //X = P * 100^M
        //return the value (X modulo (10^9 + 7)).
        int p = AwinHome / 100;
        int m = (2 * winsNeeded) - 1;
        int x = p * (100^m);
        return (x % (10^9 +7));
    }
}
