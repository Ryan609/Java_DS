package Training48Day;

import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/07/28/08:57
 **/
public class 反转部分单项链表 {
    static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            Node dh = new Node(-1);
            Node tail = dh;
            for(int i = 0; i < n; i++) {
                int num = sc.nextInt();
                Node node = new Node(num);
                tail.next = node;
                tail = node;
            }
            int L = sc.nextInt();
            int R = sc.nextInt();

            Node newNode = prevList(dh.next, L, R);
            while (newNode != null) {
                System.out.print(newNode.val + " ");
                newNode = newNode.next;
            }
        }
    }

    private static Node prevList(Node head, int l, int r) {
        Node dh = new Node(-1);
        dh.next = head;
        Node prev = dh;
        for (int i = 1; i < l; i++) {
            prev = prev.next;
        }
        Node cur = prev.next;
        for (int i = l; i < r; i++) {
            Node thrid = cur.next;
            cur.next = thrid.next;
            thrid.next = prev.next;
            prev.next = thrid;
        }
        return dh.next;
    }
}
