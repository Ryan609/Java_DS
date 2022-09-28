package codetest;



import java.util.*;

public class test {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while (n > 0) {
//            String str1 = sc.nextLine();
//            String str2 = sc.nextLine();
//
//        }

        String str1 = "yesyes";
        String str2 = "yse";

        if (isSub(str1, str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isSub(String s1, String s2) {
        if (null == s2 || null == s1) {
            return false;
        }
        if (s1.length() < s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                int j = i+1;
                int k = 1;
                while (j < s1.length() && k < s2.length() && s1.charAt(j) == s2.charAt(k)) {
                    j++;
                    k++;
                }
                if (k == s2.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}