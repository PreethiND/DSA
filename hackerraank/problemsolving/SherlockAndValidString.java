package hackerraank.problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndValidString {
    public static void main(String[] args) {
        String s = "abbccc";
        System.out.println(isValid(s));
    }

    public static String isValid(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (char c : ch) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        int[] arr = new int[charFreqMap.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> map : charFreqMap.entrySet()) {
            arr[i++] = map.getValue();
        }
        Arrays.sort(arr);

        if (charFreqMap.size() == 1) return "YES";

        int first = arr[0];
        int second = arr[1];
        int secondLast = arr[arr.length - 2];
        int last = arr[arr.length - 1];

        // 1. If all frequencies are the same
        if (first == last) return "YES";

        // 2. If we can remove one occurrence of a character appearing only once (1, x, x, x)
        if (first == 1 && second == last) return "YES";

        // 3. If the largest frequency is exactly 1 more than others and occurs only once (x, x, x, x, x+1)
        if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";

        // Else Invalid String
        return "NO";
    }
}
