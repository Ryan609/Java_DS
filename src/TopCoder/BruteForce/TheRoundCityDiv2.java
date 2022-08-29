package TopCoder.BruteForce;

/**
 * @author: xinyan
 * @data: 2022/08/10/09:57
 **/
public class TheRoundCityDiv2 {
    public static void main(String[] args) {
        System.out.println(find(1));
        System.out.println(find(2));
        System.out.println(find(3));
        System.out.println(find(47));
    }

    public static int find(int r) {
        int count = 0;
        for (int i = -100; i < 101; i++) {
            for (int j = -100; j < 101; j++) {
                int num = ((i*i) + (j*j));
                if (Math.sqrt(num) <= r) {
                    count++;
                }
            }
        }
        return count-1;
    }
}
