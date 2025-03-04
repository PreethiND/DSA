package leetcode.recursion;

public class FindKthCharacterInStringGame {
    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }

    public static char computeNextChar(char ch) {
        return (char) (ch + 1);
    }

    //    Iterative solution
    public static char kthCharacter(int k) {
        String word = "a";

        while (word.length() < k) {
            String genString = "";
            for (int i = 0; i <= word.length() - 1; i++) {
                char nextChar = computeNextChar(word.charAt(i));
                genString = genString + nextChar;
            }
            word = word + genString;
        }
        return word.charAt(k - 1);
    }
}

