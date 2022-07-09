package codetest;

/**
 * @author: xinyan
 * @data: 2022/07/09/15:20
 **/
public class test {
    public static void main(String[] args) {
        int l = 200;
        // returns the string representation of the unsigned int value
        // represented by the argument in binary (base 2)
        String s =  Integer.toBinaryString(l);
        String[] arr = s.split("0");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count < arr[i].length()) {
                count = arr[i].length();
            }
        }
        System.out.println(count);
    }
}
