package TopCoder.BruteForce;

/**
 * @author: xinyan
 * @data: 2022/08/04/18:25
 **/
public class FoxAndGame {

    public static void main(String[] args) {
        String[] arr = {"ooo", "ooo"};
        String[] arr1 = {"ooo", "oo-", "o--"};
        String[] arr2 = {"ooo", "---", "oo-", "---", "o--"};
        String[] arr3 = {"o--", "o--", "o--", "ooo", "---"};
        String[] arr4 = {"---", "o--", "oo-", "ooo", "ooo", "oo-", "o--", "---"};
        String[] arr5 = {"---", "---", "---", "---", "---", "---"};
        String[] arr6 = {"oo-"};
        System.out.println(countStars(arr));
        System.out.println(countStars(arr1));
        System.out.println(countStars(arr2));
        System.out.println(countStars(arr3));
        System.out.println(countStars(arr4));
        System.out.println(countStars(arr5));
        System.out.println(countStars(arr6));
    }

    public static int countStars(String[] result) {
        int res = 0;
        for (int i = 0; i < result.length; i++) {
            String str = result[i];
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == 'o') {
                    res++;
                }
            }
        }
        return res;
    }
}
