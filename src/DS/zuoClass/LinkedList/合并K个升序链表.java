package DS.zuoClass.LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: xinyan
 * @data: 2022/09/19/20:47
 * https://leetcode.cn/problems/merge-k-sorted-lists/
 **/
public class 合并K个升序链表 {

    public static class ListNodeComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        // 使用优先级队列(小根堆).
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new ListNodeComparator());
        // 先将数组中的所有头结点加入到堆中, 会自动排序
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                heap.add(lists[i]);
            }
        }
        if (heap.isEmpty()) {
            return null;
        }
        // 将最小的节点弹出当做head, pre指针指向head
        ListNode head = heap.poll();
        ListNode pre = head;
        // 如果pre.next不为空说明后面还有节点, 将下一个及其后续所有放入堆中.
        if (pre.next != null) {
            heap.add(pre.next);
        }
        // 堆不为空重复操作
        while (!heap.isEmpty()) {
            // 弹出当前最小节点
            ListNode cur = heap.poll();
            // pre.next指向cur进行了连接, pre前进到cur.
            pre.next = cur;
            pre = cur;
            // 如果cur.next不为null说明后续还有节点, 将后续节点重新放入堆中, 以此重复.
            if (cur.next != null) {
                heap.add(cur.next);
            }
        }
        return head;
    }
}

