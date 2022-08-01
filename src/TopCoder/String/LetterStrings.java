package TopCoder.String;

/**
 * @author: xinyan
 * @data: 2022/08/01/19:43
 **/
public class LetterStrings {

    public static void main(String[] args) {
        String[] str = {"-A-B-C-D", "--------EFGHI", "JKLMNOPQR", "---STU-VW-XYZ"};
        System.out.println(sum(str));

    }

    public static 	int sum(String[] s) {
        String[] str = new String[s.length];
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            str[i] = s[i].replaceAll("-","");
        }
        for (int i = 0; i < str.length; i++) {
            count += str[i].length();
        }
        return count;
    }
}
