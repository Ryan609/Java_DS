package LeetCode.Map_Set;

import java.util.HashMap;

/**
 * 复制带随机指针的链表
 * https://leetcode.cn/problems/copy-list-with-random-pointer/
 * @author: xinyan
 * @data: 2022/05/21/16:05
 **/



// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Num138 {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        for (Node x = head; x != null; x = x.next) {
            Node node = new Node(x.val);
            map.put(x,node);
        }
        for (Node x = head; x != null; x = x.next) {
            map.get(x).next = map.get(x.next);
            map.get(x).random = map.get(x.random);
        }
        return map.get(head);
    }
}
