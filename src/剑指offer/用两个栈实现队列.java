package 剑指offer;

import java.util.Stack;

/**
 * @author: xinyan
 * @data: 2022/08/01/22:28
 * https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 **/
public class 用两个栈实现队列 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public void CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int n = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return n;
    }
}
