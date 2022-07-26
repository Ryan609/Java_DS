package Training48Day;

/**
 * @author: xinyan
 * @data: 2022/07/26/09:47
 **/
public class 跳台阶扩展问题 {

    public int jumpFloorII (int number) {
        // write code here
        int num = number - 1;
        int n = (int)Math.pow(2,num);
        return n;
    }

    public int jumpFloorII2 (int number) {
        // write code here
        //位运算 计算 x * 2^n, 只需要将x左移n位,  x << n
        // 所以 2^ n-1, 可以写为 1 * 2^ n-1 =  1 << (n-1)
        return 1 << (number-1);
    }
}
