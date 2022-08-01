package TopCoder.String;

/**
 * @author: xinyan
 * @data: 2022/08/01/20:52
 **/
public class DiamondHunt {
    public static void main(String[] args) {
        String str = "><<><><<>>>><<>><<><<>><<<>>>>>><<<";
        System.out.println(countDiamonds(str));
    }

    public static int countDiamonds(String mine) {
        int res = 0;
        while (mine.contains("<>")) {
            mine = mine.replaceFirst("<>", "");
            res++;
        }
        return res;
    }
}
