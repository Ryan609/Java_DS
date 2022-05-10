package LeetCode.LinkedList;


public class List_21 {
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // if (list1 == null) {
    // return list2;
    // }
    // if (list2 == null) {
    // return list1;
    // }
    // ListNode dummyHead = new ListNode();
    // ListNode tail = dummyHead;
    // while (list1 != null && list2 != null) {
    // if (list1.val <= list2.val) {
    // tail.next = list1;
    // tail = list1;
    // list1 = list1.next;
    // } else {
    // tail.next = list2;
    // tail = list2;
    // list2 = list2.next;
    // }
    // }
    // if (list1 == null) {
    // tail.next = list2;
    // }
    // if (list2 == null) {
    // tail.next = list1;
    // }
    // return dummyHead.next;
    // }

    // 递归法
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        list2.next = mergeTwoLists(list2.next, list1);
        return list2;
    }
}
