package recursion;

public class NaturalSum {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(naturalSum(n));
    }

    public static int naturalSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + naturalSum(n - 1);
    }
}
