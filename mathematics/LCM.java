package mathematics;

public class LCM {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 8;
        System.out.print("The GCD of " + n1 + " and " + n2 + " is " + getLeastCommonMultiplier(n1, n2));
    }

//  Brute Force
//    static int getLeastCommonMultiplier(int n1, int n2) {
//        int res = Math.max(n1, n2);
//        while (true) {
//            if ((res % n1 == 0) && (res % n2 == 0)) {
//                break;
//            } else {
//                res++;
//            }
//        }
//        return res;
//    }

    //    Optimised solution using the formula - [  (a*b) = gcd(a,b) * lcm(a,b)    ]
    static int getLeastCommonMultiplier(int n1, int n2) {
        return (n1 * n2) / (GCD.getGreatestCommonDivisor(n1, n2));
    }
}
