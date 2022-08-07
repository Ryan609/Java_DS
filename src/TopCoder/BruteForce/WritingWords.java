package TopCoder.BruteForce;

/**
 * @author: xinyan
 * @data: 2022/08/04/18:23
 **/
public class WritingWords {

    public static void main(String[] args) {
        System.out.println(write("A"));
        System.out.println(write("ABC"));
        System.out.println(write("VAMOSGIMNASIA"));
        System.out.println(write("TOPCODER"));
        System.out.println(write("SINGLEROUNDMATCH"));
        System.out.println(write("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ"));
    }

    public static int write(String word) {
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            res += word.charAt(i) - 64;
        }
        return res;
    }
}
