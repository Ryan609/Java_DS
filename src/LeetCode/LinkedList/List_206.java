package LeetCode.LinkedList;

public class List_206 {

    //头插法
    // public ListNode reverseList(ListNode head) {
    //     ListNode newList = new ListNode();

    //     while(head != null) {
    //         ListNode node = new ListNode();
    //         node.val = head.val;
    //         node.next = newList.next;
    //         newList.next = node;
    //         head = head.next;
    //     }
    //     return newList.next;
    // }

    //原地翻转
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode cur = head;
        
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     while (cur != null) {
    //         ListNode next = cur.next;
    //         cur.next = prev;
    //         prev = cur;
    //         cur = next;   
    //     }
    //     return prev;
    // }

    // 3.递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 暂存一下第二个节点的地址
        ListNode node = head.next;
        // 第二个节点开始的子链表反转交给子函数
        ListNode newHead = reverseList(head.next);
        // 3.拼接当前head
        node.next = head;
        head.next = null;
        return newHead;
    }
}
