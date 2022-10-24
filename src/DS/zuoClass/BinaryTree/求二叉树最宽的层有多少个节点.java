package DS.zuoClass.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: xinyan
 * @data: 2022/10/24/15:36
 **/
public class 求二叉树最宽的层有多少个节点 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static int maxWidthNoMap(Node head) {
        if (head == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        Node curEnd = head;
        Node nextEnd = null;
        int max = 0;
        int curLevel = 0;
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur.left != null) {
                queue.add(cur.left);
                nextEnd = cur.left;
            }
            if (cur.right != null) {
                queue.add(cur.right);
                nextEnd = cur.right;
            }
            curLevel++;
            if (cur == curEnd) {
                max = Math.max(max, curLevel);
                curLevel = 0;
                curEnd = nextEnd;
            }
        }
        return max;
    }
}
