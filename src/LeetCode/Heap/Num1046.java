package LeetCode.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 最后一块石头的重量
 * https://leetcode.cn/problems/last-stone-weight/
 * @author: xinyan
 * @data: 2022/05/21/09:39
 **/
public class Num1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int num : stones) {
            queue.offer(num);
        }
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a != b) {
                queue.offer(a-b);
            }
        }
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.peek();
    }
}
