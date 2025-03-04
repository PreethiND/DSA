package recursion;

public class StringPermutaions {
    public static void main(String[] args) {
        String s = "ABC";
        char[] ch = s.toCharArray();
        printPermutations(ch, 0);
    }

    public static void swap(char[] arr, int i, int fi) {
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }

    public static void printPermutations(char[] ch, int fi) {
        int length = ch.length - 1;
        if (fi == length) {
            System.out.println(ch);
            return;
        }

        for (int i = fi; i <= length; i++) {
            swap(ch, i, fi);
            printPermutations(ch, fi + 1);
            swap(ch, i, fi);
        }
    }
}
