package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/03/12:47
 **/
public class AlternateColors {

//    public static void main(String[] args) {
//        System.out.println(getColor(1,1,1,3));
//        System.out.println(getColor(3,4,5,4));
//        System.out.println(getColor(7,7,1,7));
//        System.out.println(getColor(1000000000000L, 1, 1, 1000000000002L));
//        System.out.println(getColor(653,32,1230,556));
//        System.out.println(getColor(39,4,29,7));
//        System.out.println(getColor(33,38,18,85));
//        System.out.println(getColor(1362806, 9637722, 7058502, 1977778));
//        System.out.println(getColor(17964018705L, 65273511246L, 31105494141L, 50314587302L));
//        System.out.println(getColor(66977089037L, 56944425814L, 82337384434L, 197258589648L));
//        System.out.println(getColor(271281576404L, 789227539981L, 962212822048L, 1863718050608L));
//        System.out.println(getColor(26, 26, 26, 33));
//        System.out.println(getColor(726158833853L, 726158833853L, 726158833853L, 932704193638L));
//        System.out.println(getColor(999999999, 999999999, 999999999, 999999999));
//        System.out.println(getColor(10000000000L, 10000000000L, 10000000000L, 10000000000L));
//        System.out.println(getColor(1000000000000L, 999999999999L, 99999999999L, 1999999999999L));
//    }

    public static String getColor(long r, long g, long b, long k) {
        long min = r;
        if (min > g) {
            min = g;
            if (min > b) {
                min = b;
            }
        } else if (min > b) {
            min = b;
            if (min > g) {
                min = g;
            }
        }

        if (k <= (3*min)) {
            if (k%3==0){
                return "BLUE";
            } else if (k % 3 ==1) {
                return "RED";
            } else if (k % 3 == 2) {
                return "GREEN";
            }
        } else if (k > (3*min)){
            if (min == r) {
                g = g-r;
                b = b-r;
                k = k - r;
                min = Math.min(g,b);
                if (k <= (2*min)) {
                    if (k%2 == 0) {
                        return "BLUE";
                    } else if (k % 2 == 1) {
                        return "GREEN";
                    }
                } else if (k > (2*min)) {
                    if (min == g) {
                        return "BLUE";
                    } else {
                        return "GREEN";
                    }
                }

            } else if (min == g) {
                r = r - g;
                b = b - g;
                k = k - g;
                min = Math.min(r,b);
                if (k <= (2*min)) {
                    if (k%2 == 0) {
                        return "BLUE";
                    } else if (k % 2 == 1) {
                        return "RED";
                    }
                }else if (k > (2*min)) {
                    if (min == r) {
                        return "BLUE";
                    } else {
                        return "RED";
                    }
                }

            } else if (min == b) {
                r = r - b;
                g = g - b;
                k = k - b;
                min = Math.min(r,g);
                if (k<=2*min) {
                    if (k%2 == 0) {
                        return "GREEN";
                    } else if (k % 2 == 1) {
                        return "RED";
                    }
                } else if (k > (2*min)) {
                    // 1 2 : 10
                    if (min == r) {
                        return "GREEN";
                    } else {
                        return "RED";
                    }
                }
            }
        }
        return null;
    }

}
