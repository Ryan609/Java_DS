package Training48Day;

import java.util.Scanner;


/**
 * @author: xinyan
 * @data: 2022/08/07/09:43
 **/
public class Rational_Arithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s1 = sc.next();
            String s2 = sc.next();
            Rational r1 = new Rational(Rational.paraseN(s1), Rational.paraseD(s1));
            Rational r2 = new Rational(Rational.paraseN(s2), Rational.paraseD(s2));

            System.out.println(r1 + " + " + r2 + " = " + r1.Add(r2));
            System.out.println(r1 + " - " + r2 + " = " + r1.Sub(r2));
            System.out.println(r1 + " * " + r2 + " = " + r1.Mul(r2));
            System.out.println(r1 + " / " + r2 + " = " + r1.Div(r2));
        }
    }

}

class Rational {
    private long numerator; // 分子
    private long denominator; // 分母
    private long integer; // 整数部分
    private boolean negetive = false; // 负数
    public boolean isZero = false; // 分母为零
    private long totalNumerator;

    public static long paraseN(String s) {
        return Long.parseLong(s.substring(0, s.indexOf('/')));
    }
    public static long paraseD(String s) {
        return Long.parseLong(s.substring(s.indexOf('/'), s.length()));
    }

    public Rational(long n, long d) {
        if (d == 0) {
            isZero = true;
            return;
        }
        if (n < 0) {
            negetive = !negetive;
        }
        if (d < 0) {
            negetive = !negetive;
        }

        integer = n / d;
        numerator = n - integer * d;
        denominator = Math.abs(d);

        if (numerator > 1 || numerator < -1) {
            long gcb = calcGCD(Math.abs(numerator), denominator);
            if (gcb > 0) {
                numerator /= gcb;
                denominator /= gcb;
            }
        }
        totalNumerator = numerator + integer*denominator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isZero) {
            sb.append("Inf");
            return new String(sb);
        }
        if (integer == 0 && numerator == 0) {
            sb.append("0");
            return new String(sb);
        }
        if (negetive) {
            sb.append("(-");
        }
        if (0 != integer) {
            sb.append(Math.abs(integer));
            if (0 != numerator) {
                sb.append(' ');
            }
        }
        if(0 != numerator){
            sb.append(Math.abs(numerator));
            sb.append('/');
            sb.append(denominator);
        }
        if (negetive) {
            sb.append(")");
        }
        return new String(sb);
    }

    public Object Add(Rational r) {
        long n = totalNumerator * r.denominator + denominator*r.totalNumerator;
        long d = denominator * r.denominator;
        return new Rational(n, d);
    }

    public Object Sub(Rational r) {
        long n = totalNumerator * r.denominator - denominator * r.totalNumerator;
        long d = denominator * r.denominator;
        return new Rational(n, d);
    }

    public Object Mul(Rational r) {
        long n = totalNumerator * r.totalNumerator;
        long d = denominator * r.denominator;
        return new Rational(n, d);
    }

    public Object Div(Rational r) {
        long n = totalNumerator * r.denominator;
        long d = denominator * r.totalNumerator;
        return new Rational(n, d);
    }

    private long calcGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return calcGCD(b, a % b);
    }
}
