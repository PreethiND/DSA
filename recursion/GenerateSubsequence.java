package recursion;

public class GenerateSubsequence {

    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        subseq(s, ans);
//        System.out.println(subsets(s, ans));
    }

    public static void subseq(String s, String ans) {
        // Base case: when string is empty, return the current subset
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // Include the first character of the string and recurse
        subseq(s.substring(1), ans + s.charAt(0));

        // Don't include the first character and recurse
        subseq(s.substring(1), ans);
    }

//    public static List<String> subsets(String s, String ans) {
//        List<String> subsetsList = new ArrayList<>();
//
//        // Base case: when string is empty, return the current subset
//        if (s.isEmpty()) {
//            subsetsList.add(ans);
//            return subsetsList;
//        }
//
//        // Include the first character of the string and recurse
//        subsetsList.addAll(subsets(s.substring(1), ans + s.charAt(0)));
//
//        // Don't include the first character and recurse
//        subsetsList.addAll(subsets(s.substring(1), ans));
//
//        return subsetsList;
//    }
}
