package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/20:30
 **/
public class SplitStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        char L = 0;
        char R = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == 'L') {
                L++;
            } else {
                R++;
            }
            if (L == R) {
               L = 0;
               R = 0;
               res++;
            }
        }
        return res;
    }

}
