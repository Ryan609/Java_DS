package DS.zuoClass.LinkedList;

/**
 * @author: xinyan
 * @data: 2022/09/03/09:40
 * 题目链接: https://leetcode.cn/problems/reverse-nodes-in-k-group/
 **/
public class K个一组翻转链表 {


    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = head;
        ListNode end = getKGroupEnd(start, k);
        if (end == null) {
            return head;
        }
        head = end;
        reverse(start, end);
        ListNode lastEnd = start;
        while (lastEnd.next != null) {
            start = lastEnd.next;
            end = getKGroupEnd(start,k);
            if (end == null) {
                return head;
            }
            reverse(start, end);
            // 修改指向的节点
            lastEnd.next = end;
            lastEnd = start;
        }
        return head;
    }

    // 找到每组开始和结束的范围.
    private static ListNode getKGroupEnd(ListNode start, int k) {
        while (--k != 0 && start != null) {
            start = start.next;
        }
        return start;
    }

    //反转每组链表
    private static void reverse(ListNode start, ListNode end) {
        end = end.next;
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = start;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = end;
    }
}
