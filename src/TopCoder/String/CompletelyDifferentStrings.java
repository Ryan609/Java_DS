package TopCoder.String;

/**
 * @author: xinyan
 * @data: 2022/08/03/09:40
 **/
public class CompletelyDifferentStrings {

    public static int count(int alpha, String[] a) {
        int ans = 1;
        int n = a[0].length();
        for (int i = 0; i < n; i++) {
            boolean[] here = new boolean[alpha];
            for (String s : a)
                here[s.charAt(i) - 'a'] = true;

            int cnt = 0;
            for (int j = 0; j < alpha; j++)
                if (!here[j])
                    cnt++;
            ans *= cnt;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] a = {"ab"};
        System.out.println(count(n,a));
    }
}
