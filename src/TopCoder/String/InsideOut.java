package TopCoder.String;

/**
 * @author: xinyan
 * @data: 2022/08/01/16:34
 **/
public class InsideOut {
    public static void main(String[] args) {
        String str = "RUT OWT SNEH HCNERF EERHTEGDIRTRAP A DNA  SEVODELT";
        System.out.println(unscramble(str));
    }

    public static String unscramble(String line) {
        StringBuilder sb = new StringBuilder();
        char[] arr = line.toCharArray();
        int mid = line.length() / 2;
        for (int i = mid-1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        for (int i = arr.length-1; i >= mid; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
