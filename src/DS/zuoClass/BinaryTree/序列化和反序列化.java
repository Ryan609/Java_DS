package DS.zuoClass.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: xinyan
 * @data: 2022/10/21/16:23
 **/
public class 序列化和反序列化 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }


    // 先序遍历 序列化和反序列化
    public static Queue<String> preSerial(Node head) {
        Queue<String> ans = new LinkedList<>();
        pres(head, ans);
        return ans;
    }

    public static void pres(Node head, Queue<String> ans) {
        if (head == null) {
            ans.add(null);
        } else {
            ans.add(String.valueOf(head.value));
            pres(head.left, ans);
            pres(head.right, ans);
        }
    }

    // 后续遍历 序列化和反序列化
    public static void pres1(Node head, Queue<String> ans) {
        if (head == null) {
            ans.add(null);
        } else {
            ans.add(String.valueOf(head.value));
            pres(head.left, ans);
            pres(head.right, ans);
        }
    }
   
}
