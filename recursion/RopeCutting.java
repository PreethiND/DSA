package recursion;

public class RopeCutting {
    public static void main(String[] args) {
        int n = 15, a = 5, b = 8, c = 7;
        System.out.println("Maximum cuts are: " + maxPieces(n, a, b, c));
    }

    public static int maxPieces(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;

        int pieces;
        int aPieces = maxPieces(n - a, a, b, c);
        int bPieces = maxPieces(n - b, a, b, c);
        int cPieces = maxPieces(n - c, a, b, c);
        pieces = Math.max(cPieces, Math.max(aPieces, bPieces));

        if (pieces < 0) return -1;
        return pieces + 1;
    }
}
