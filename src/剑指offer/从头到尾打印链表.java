package 剑指offer;

import LeetCode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xinyan
 * @data: 2022/08/02/16:01
 **/


public class 从头到尾打印链表 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        ListNode dh = new ListNode(-1);
        //先将原链表通过尾插法插入新链表达到反转的效果.
        while (head != null) {
            int val = head.val;
            head = head.next;
            ListNode node = new ListNode(val);
            if (dh.next == null) {
                dh.next = node;
            } else {
                node.next = dh.next;
                dh.next = node;
            }
        }
        //将新链表的数据插入list中再转为数组输出.
        List<Integer> list = new ArrayList<>();
        while (dh.next != null) {
            list.add(dh.next.val);
            dh = dh.next;
        }
        int n = list.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
