package LeetcodeProblems;

import java.util.Arrays;

public class Leetcode_1984MiniDiff {

    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        int minDiff = miniDifference(nums,k);
        System.out.println(minDiff);
    }

    public static int miniDifference(int[] nums, int k){
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i<= nums.length - k; i++){
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}