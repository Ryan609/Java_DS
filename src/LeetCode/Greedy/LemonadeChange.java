package LeetCode.Greedy;

/**
 * @author: xinyan
 * @data: 2022/10/11/16:52
 * https://leetcode.com/problems/lemonade-change/
 **/
public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int ten = 0;
        int five = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10){
                if (five != 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (ten != 0 && five != 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
