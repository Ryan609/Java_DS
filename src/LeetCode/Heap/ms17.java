package LeetCode.Heap;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
 * https://leetcode.cn/problems/smallest-k-lcci/
 * @author: xinyan
 * @data: 2022/05/20/10:25
 **/
public class ms17 {
    public int[] smallestK(int[] arr, int k) {
        int[] ret = new int[k];
        if (arr.length == 0 || k == 0) {
            return ret;
        }
        //将JDK默认最小堆改为最大堆.
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //遍历原数组, 新ret只能存放k个元素
        for (int i = 0; i < arr.length; i++) {
            //如果堆中没有存满直接存入
            if (queue.size() < k) {
                queue.offer(arr[i]);
            } else {
                //存满的话对比堆顶元素是否大于新元素, 如果大于就替换出它
                int max = queue.peek();
                if (arr[i] < max) {
                    queue.poll();
                    queue.offer(arr[i]);
                }
            }
        }
        //最后遍历存储ret
        int i = 0;
        while (!queue.isEmpty()) {
            ret[i++] = queue.poll();
        }
        return ret;
    }

//    public int[] smallestK(int[] arr, int k) {
//        Arrays.sort(arr);
//        int[] ret = new int[k];
//        for (int i = 0; i < k; i++) {
//            ret[i] = arr[i];
//        }
//        return ret;
//    }

}
