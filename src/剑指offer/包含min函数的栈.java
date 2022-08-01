package 剑指offer;

import java.util.Stack;

/**
 * @author: xinyan
 * @data: 2022/08/01/22:35
 * https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/submissions/
 * 双栈辅助
 **/
public class 包含min函数的栈 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public void MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty() || stack2.peek() >= x) {
            stack2.push(x);
        }
    }

    public void pop() {
        int n = stack1.pop();
        int n2 = stack2.peek();
        if (n == n2) {
            stack2.pop();
        }
    }

    public int top() {
       return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
