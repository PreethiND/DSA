package mathematics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int n1 = 151;
        int n2 = 10;
        System.out.print("The GCD of " + n1 + " and " + n2 + " is " + getGreatestCommonDivisor(n1, n2));
    }

    //    Brute Force
//    static int getGreatestCommonDivisor(int n1, int n2) {
//        int res = Math.min(n1, n2);
//        while (res > 0) {
//            if ((n1 % res == 0) && (n2 % res == 0)) {
//                break;
//            } else {
//                res--;
//            }
//        }
//        return res;
//    }

    //    Euclidean Algorithm
    static int getGreatestCommonDivisor(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return getGreatestCommonDivisor(n2, (n1 % n2));
        }
    }
}
