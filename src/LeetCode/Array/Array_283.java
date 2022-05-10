package LeetCode.Array;/*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意 ，必须在不复制数组的情况下原地对数组进行操作。*/

public class Array_283 {
    public void moveZeroes(int[] nums) {
        //双指针fir和sec
        int fir = 0;
        int sec = 0;
        
        //sec从头遍历
		while (sec < nums.length) {
            //当sec索引的值不等于0时,将其覆盖到fir
            //等于0就跳过继续++
            if (nums[sec] != 0) {
                nums[fir] = nums[sec];
                fir++;
            }
            sec++;
        }

        //从fir开始,到数组结束,全部换为0
		for(int i = fir; i < nums.length; i++) {
			nums[i] = 0;
		}
    }
}