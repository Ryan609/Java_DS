package codetest;

/**
 * @author: xinyan
 * @data: 2022/07/09/15:20
 **/
public class test {
    public static void main(String[] args) {
        System.out.println((f2() << 2) + (f2() << 1) + f2());
    }

    // lib里的，不能改！
    public static int f1() {
        return (int) (Math.random() * 5) + 1;
    }

    public static int f2() {
        int ans = 0;
        do {
            ans = f1();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    public static int f3() {
        return (f2() << 2) + (f2() << 1) + f2();
    }
}
