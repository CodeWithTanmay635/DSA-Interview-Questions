package LeetcodeProblems;

import java.util.Arrays;

public class Leetcode_167TwoSum2 {
    static void main() {
        int[] arr = {2,3,4};
        int val = 6;
        System.out.println(Arrays.toString(sum(arr, val)));
    }
    public static int[] sum(int[] arr,int val){

        int left = 0;
        int right = left+1;


        while(left < arr.length){
            int target = arr[left] + arr[right];
                if(target == val){
                    return new int[] {left + 1, right + 1};
                }
                left++;

                        }
        return new int[]{};
    }
}
