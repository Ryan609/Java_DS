package LeetCode.Stack_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.cn/problems/implement-stack-using-queues/
 * 用队列实现栈
 */

public class Queue_225 {
    //双队列实现
//    private Queue<Integer> q1 = new LinkedList<>();
//    private Queue<Integer> q2 = new LinkedList<>();
//
//    public void push(int x) {
//        if (q1.isEmpty()) {
//            q1.offer(x);
//        } else {
//            q2.offer(x);
//            while (!q1.isEmpty()) {
//                q2.offer(q1.poll());
//            }
//            Queue<Integer> temp = q1;
//            q1 = q2;
//            q2 = temp;
//        }
//
//    }
//
//    public int pop() {
//        return q1.poll();
//    }
//
//    public int top() {
//        return q1.peek();
//    }
//
//    public boolean empty() {
//        return q1.isEmpty();
//    }

    //单队列实现
    Queue<Integer> queue = new LinkedList<>();
    private int size;

    public void push(int x) {
        int size = queue.size();
        queue.offer(x);
        for (int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
       return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
