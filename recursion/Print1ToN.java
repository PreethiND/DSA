package recursion;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(10);
        print1ToNTailRecursion(10, 1);
    }

    public static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void print1ToNTailRecursion(int n, int k) {
        if (n == 0) {
            return;
        }
        System.out.println(k);
        print1ToNTailRecursion(n - 1, k + 1);
    }
}
