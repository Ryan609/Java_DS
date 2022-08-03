package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/03/09:06
 **/
public class GolfScore {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 3, 4, 4,
                1, 4, 2, 3, 3, 5,
                4, 1, 4, 4, 2, 1};
        String[] str = {"triple bogey", "triple bogey", "bogey", "par", "triple bogey", "double bogey",
                "triple bogey", "triple bogey", "par", "eagle", "bogey", "bogey",
                "birdie", "par", "triple bogey", "eagle", "triple bogey", "triple bogey"};
        System.out.println(tally(arr,str));

    }

    public static int tally(int[] parValues, String[] scoreSheet) {
        int sum = 0;
        for (int i = 0; i < parValues.length; i++) {
                if (scoreSheet[i] == "triple bogey") {
                    sum += parValues[i] + 3;
                } else if (scoreSheet[i] == "double bogey") {
                    sum += parValues[i] + 2;
                } else if (scoreSheet[i] == "bogey") {
                    sum += parValues[i] + 1;
                } else if (scoreSheet[i] == "par") {
                    sum += parValues[i];
                } else if (scoreSheet[i] == "birdie") {
                    sum += parValues[i] - 1;
                } else if (scoreSheet[i] == "eagle") {
                    sum += parValues[i] - 2;
                } else if (scoreSheet[i] == "albatross") {
                    sum += parValues[i] - 3;
                } else if (scoreSheet[i] == "hole in one") {
                    sum += 1;
                }
        }
        return sum;
    }
}
