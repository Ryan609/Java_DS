package Training48Day;

/**
 * @author: xinyan
 * @data: 2022/07/27/09:36
 * https://www.nowcoder.com/questionTerminal/59ac416b4b944300b617d4f7f111b215
 **/
public class 不用加减乘除做加法 {
    /**
     * 解题思路: 使用位或运算, 两数相加 = (num1 ^ num2) + (num1&num2)<<1.
     * (num1 ^ num2) 不进位 + (num1&num2)<<1 进位
     * 直到carry为0计算结束返回num1.
     */
    public int Add(int num1,int num2) {
        while(num2 != 0)  {
            int sum = num1 ^ num2;
            int carry = (num1&num2) <<1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
