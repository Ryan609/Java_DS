package Bit_DS.Sort;

import java.lang.reflect.Method;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
/**
 * 测试排序的性能以及产生辅助的测试按钮
 * @author: xinyan
 * @data: 2022/05/26/21:14
 **/
public class SortHelper {
    /**
     * 测试七大排序的性能以及产生辅助的测试数组
     * @author yuisama
     * @date 2022/05/26 19:43
     **/

        // 生成随机数的一个类
        private static final ThreadLocalRandom random = ThreadLocalRandom.current();

        /**
         * 1.产生一个大小为n的随机整数数组，数组的取值范围为[l..r)
         * @param n 数组的元素个数
         * @param l 数组的取值最小值
         * @param r 数组元素最大值
         * @return
         */
        public static int[] generaRandomArray(int n,int l,int r) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                // 生成一个[l..r)的随机数
                data[i] = random.nextInt(l,r);
            }
            return data;
        }

        /**
         * 2.生成一个大小为n的近乎有序的数组
         * @param n 元素个数
         * @param swapTimes 交换的次数，这个参数越大，数组越无序
         * @return
         */
        public static int[] generateSortedArray(int n,int swapTimes) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = i;
            }
            for (int i = 0; i < swapTimes; i++) {
                // 生成一个[0..n)随机数
                int a = random.nextInt(n);
                int b = random.nextInt(n);
                int temp = data[a];
                data[a] = data[b];
                data[b] = temp;
            }
            return data;
        }

        /**
         * 深拷贝原数组
         * @param arr
         * @return
         */
        public static int[] arrCopy(int[] arr) {
            return Arrays.copyOf(arr,arr.length);
        }

        /**
         * 在指定的数组arr上测试排序名称为sortName的排序算法性能
         * @param arr
         * @param sortName
         */
        public static void testSort(int[] arr,String sortName) {
            Class<SevenSort> cls = SevenSort.class;
            try {
                Method method = cls.getDeclaredMethod(sortName,int[].class);
                long start = System.nanoTime();
                method.invoke(null,arr);
                long end = System.nanoTime();
                if (isSorted(arr)) {
                    System.out.println(sortName + "排序完成，共耗时:" + (end - start) / 1000000.0 + "ms");
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * 检查当前的arr数组是否是一个非降序数组，前一个元素 <= 后一个元素
         * @param arr
         * @return
         */
        private static boolean isSorted(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // 反例
                    System.err.println("排序算法有误!");
                    return false;
                }
            }
            return true;
        }
}
