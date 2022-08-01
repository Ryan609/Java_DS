package TopCoder.String;

/**
 * @author: xinyan
 * @data: 2022/08/01/20:06
 **/
public class TireRotation {
    public static void main(String[] args) {
        String initial = "FJNP";
        String current = "NPJF";
        System.out.println(getCycle(initial,current));
    }

    public static int getCycle(String initial, String current) {
        char[] arr = initial.toCharArray();
        int count = 1;
        if (initial.equals(current)) {
            return count;
        } else {
            while (!(String.valueOf(arr).equals(current))) {
                char temp1 = arr[0];
                char temp2 = arr[1];
                char temp3 = arr[2];
                char temp4 = arr[3];
                arr[0] = temp4;
                arr[1] = temp3;
                arr[2] = temp1;
                arr[3] = temp2;
                count++;
                if (count >4) {
                    break;
                }
            }
            if (count <= 4) {
                return count;
            } else {
                return -1;
            }
        }
    }
}
