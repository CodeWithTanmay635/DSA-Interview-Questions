package DSA_Patterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main() {
        int[] arr = {1,3,5,7,4,6,8};
        int target = 9;
       int[] sum = twoSum(arr,target);
        System.out.println(Arrays.toString(sum));
    }
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store: <Value, Index>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement is already in the map, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store current number and its index
            map.put(nums[i], i);
        }

        // Return empty if no solution is found (though the problem usually guarantees one)
        return new int[] {};
    }
}
