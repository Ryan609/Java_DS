package DS.zuoClass.LinkedList;

/**
 * @author: xinyan
 * @data: 2022/09/27/16:01
 * https://leetcode.cn/problems/remove-linked-list-elements/submissions/
 **/
public class 删除指定的数 {

    public ListNode removeElements(ListNode head, int val) {
        // 首先找到新的头结点
        while (head != null) {
            if (head.val != val) {
                break;
            }
            head = head.next;
        }
        ListNode pre = head;
        ListNode cur = head;
        // 依次往下找
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
