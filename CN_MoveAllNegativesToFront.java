import java.util.*;
public class Solution {
    public static int[] separateNegativeAndPositive(int arr[]) {
         List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();

        
        for (int num : arr) {
            if (num < 0) {
                negatives.add(num);
            } else {
                positives.add(num);
            }
        }

        
        int index = 0;
        for (int num : negatives) {
            arr[index++] = num;
        }
        for (int num : positives) {
            arr[index++] = num;
        }
        return arr;
        
    }
}
