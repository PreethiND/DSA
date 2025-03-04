package hackerraank.problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pairs {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 4);
        int k = 2;
        System.out.println(pairs(k, list));
    }

    public static boolean binarySearch(List<Integer> list, int numToFind) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (list.get(mid) == numToFind) {
                return true;
            } else if (list.get(mid) < numToFind) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static int pairs(int k, List<Integer> list) {
        Collections.sort(list);
        int pairCount = 0;
        for (int i : list) {
            int numberToSearch = i - k;
            if (binarySearch(list, numberToSearch)) {
                pairCount++;
            }
        }
        return pairCount;
    }
}

