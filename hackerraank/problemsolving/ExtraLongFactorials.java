package hackerraank.problemsolving;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        int n = 30;
        extraLongFactorials(n);
    }


    public static void extraLongFactorials(int n) {
        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
