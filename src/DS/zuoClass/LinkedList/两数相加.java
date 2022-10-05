package DS.zuoClass.LinkedList;

/**
 * @author: xinyan
 * @data: 2022/09/03/10:25
 * https://leetcode.cn/problems/add-two-numbers/
 **/
public class 两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = listLength(l1);
        int len2 = listLength(l2);
        ListNode l = len1 >= len2 ? l1 : l2;
        ListNode s = l == l1 ? l2 : l1;
        ListNode curL = l;
        ListNode curS = s;
        ListNode last = curL;
        int carry = 0;
        int curNum = 0;
        // 阶段1: 短链表还有
        while (curS != null) {
            curNum = curL.val + curS.val + carry;
            curL.val = curNum % 10;
            carry = curNum / 10;
            last = curL;
            curL = curL.next;
            curS = curS .next;
        }
        // 阶段2: 短链表走完, 长链表还有
        while (curL != null) {
            curNum = curL.val + carry;
            curL.val = curNum % 10;
            carry = curNum / 10;
            last = curL;
            curL = curL.next;
        }
        if (carry != 0) {
            last.next = new ListNode(1);
        }
        return l;
    }

    public static int listLength(ListNode head) {
        int res = 0;
        while (head != null) {
            res++;
            head = head.next;
        }
        return res;
    }
}
