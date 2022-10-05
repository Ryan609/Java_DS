package DS.zuoClass.Recurs;

import java.util.Stack;

/**
 * @author: xinyan
 * @data: 2022/09/07/22:39
 **/
public class 逆序一个栈 {

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        } else {
            int i = f(stack);
            reverse(stack);
            stack.push(i);
        }
    }

    public static int f(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = f(stack);
            stack.push(result);
            return last;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> test = new Stack<Integer>();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        reverse(test);
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }

    }
}
