package codetest;



import java.util.*;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(20);
        System.out.println(a);
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