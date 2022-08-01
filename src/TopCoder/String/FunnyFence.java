package TopCoder.String;


/**
 * @author: xinyan
 * @data: 2022/08/01/15:26
 **/
public class FunnyFence {

    public static void main(String[] args) {
        String s = "-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|";
        System.out.println(getLength(s));
    }

    public static int getLength (String s) {
        int res=0;
        int count=1;
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i)==s.charAt(i-1)) {
                if (count > res) {
                    res = count;
                }
                count=1;
            } else {
                count++;
            }
        }
        if (count > res) {
            res = count;
        }
        return res;
    }

//    public static int getLength (String s) {
//
//        if (s == null || s.length() < 1) return 0;
//
//        int max = 1;
//
//        // 从每个点开始中心扩散
//        for (int i = 0; i < s.length(); i++) {
//            int left = i, right = i;
//
//            while (left > 0 && ((s.charAt(left) == '|' && s.charAt(left - 1) == '-') || (s.charAt(left) == '-' && s.charAt(left - 1) == '|')))
//                left --;
//
//            while (right < s.length() - 1 && ((s.charAt(right) == '|' && s.charAt(right + 1) == '-') || (s.charAt(right) == '-' && s.charAt(right + 1) == '|')))
//                right ++;
//
//            max = Math.max(right - left + 1, max);
//        }
//
//        return max;
//    }
}
