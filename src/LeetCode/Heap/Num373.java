package LeetCode.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: xinyan
 * @data: 2022/05/18/21:01
 **/
public class Num373 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<pair> queue = new PriorityQueue<>();
        for (int i = 0; i < Math.min(nums1.length,k); i++) {
            for (int j = 0; j < Math.min(nums2.length, k); j++) {
                if (queue.size() < k) {
                    queue.offer(new pair(nums1[i], nums2[j]));
                } else {
                    int add = nums1[i] + nums2[j];
                    pair pair = queue.peek();
                    if (add < (pair.u + pair.v)) {
                        queue.poll();
                        queue.offer(new pair(nums1[i], nums2[j]));
                    }
                }
            }
        }

        List<List<Integer>> ret = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            pair pair = queue.poll();
            temp.add(pair.u);
            temp.add(pair.v);
            ret.add(temp);
        }
        return ret;
    }

}

class pair implements Comparable<pair>{
    int u;
    int v;

    public pair(int u, int v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public int compareTo(pair o) {
        return (o.u + o.v) - (this.u + this.v);
    }
}