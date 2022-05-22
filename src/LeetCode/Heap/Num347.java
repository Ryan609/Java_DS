package LeetCode.Heap;



import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: xinyan
 * @data: 2022/05/18/20:33
 **/
public class Num347 {

    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            int[] ret = new int[k];
            // 1.先扫描原数组，将出现的元素以及其频次保存到Map集合中。
            // [1,1,1,2,2,3] => {{1 : 3},{2 : 2}, {3 : 1} }
            Map<Integer,Integer> map = new HashMap<>();
            for (int i : nums) {
                if (map.containsKey(i)) {
                    // 此时元素i已经出现过，只要将频次 ++ 即可
                    int times = map.get(i);
                    map.put(i,times + 1);
                }else {
                    // 此时i第一次出现，就将该元素保存到map中
                    map.put(i,1);
                }
            }
            // 2.扫描Map集合，将出现频次最高的前k个元素添加到优先级队列中
            Queue<Freq> queue = new PriorityQueue<>();
            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if (queue.size() < k) {
                    queue.offer(new Freq(entry.getKey(),entry.getValue()));
                }else {
                    // 判断堆顶元素和当前元素的出现频次
                    // 只有当前元素的出现频次 > 堆顶元素，入队，打擂思想，不断将出现频次大的元素对换入到队列中
                    Freq freq = queue.peek();
                    if (entry.getValue() > freq.value) {
                        queue.poll();
                        queue.offer(new Freq(entry.getKey(),entry.getValue()));
                    }
                }
            }
            // 3.此时队列中就保存了出现频次最大的前k个数对 - k个Freq对象
            // 遍历队列，将Freq对象中的key取出放入结果集中即可
            int i = 0;
            while (!queue.isEmpty()) {
                ret[i ++] = queue.poll().key;
            }
            return ret;
        }
    }
    class Freq implements Comparable<Freq> {
        // 数组中出现的元素
        int key;
        // 该元素出现的频次
        int value;

        public Freq(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Freq o) {
            return this.value - o.value;
        }
    }
}
