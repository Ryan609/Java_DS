package TopCoder.Recursion;

/**
 * @author: xinyan
 * @data: 2022/08/31/10:17
 **/
public class Truckloads {

    public static int numTrucks(int numCrates, int loadSize) {
        if (numCrates <= loadSize) {
            return 1;
        }
        int newNum = numCrates / 2;
        return numTrucks(newNum, loadSize) + numTrucks(numCrates - newNum, loadSize);
    }

    public static void main(String[] args) {
        System.out.println(numTrucks(14,3));
//        System.out.println(numTrucks(15,1));
//        System.out.println(numTrucks(1024,5));
//        System.out.println(numTrucks(10000,79));
    }
}
