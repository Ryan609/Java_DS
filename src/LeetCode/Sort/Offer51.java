package LeetCode.Sort;

/**
 * 剑指offer 51 数组中的逆序对
 * @author: xinyan
 * @data: 2022/05/29/11:01
 **/
public class Offer51 {
    public int reversePairs(int[] nums) {
        return reversePairsInternal(nums,0,nums.length - 1);
    }

    private int reversePairsInternal(int[] nums, int l, int r) {
        if (l >= r) {
            return 0;
        }
        int mid = l + (r-l) / 2;
        int leftcount = reversePairsInternal(nums,l,mid);
        int rightcount = reversePairsInternal(nums, mid + 1, r);
        if (nums[mid] > nums[mid+1]) {
            return leftcount + rightcount + merge(nums,l,mid,r);
        }
        return leftcount + rightcount;
    }

    private int merge(int[] nums, int l, int mid, int r) {
        int count = 0;
        int[] aux = new int[r-l+1];
        for (int i = 0; i < aux.length ; i++) {
            aux[i] = nums[i + l];
        }
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                nums[k] = aux[j -  l];
                j++;
            } else if (j > r) {
                nums[k] = aux[i - l];
                i++;
            } else if (aux[i - l] <= aux[j - l]) {
                nums[k] = aux[i - l];
                i++;
            } else {
                count += mid - i + 1;
                nums[k] = aux[j - l];
                j++;
            }
        }
        return count;
    }

}
