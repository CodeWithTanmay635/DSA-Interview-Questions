package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class LeetCode_15ThreeSum {
    static void main() {
        int[] arr = {1,2,0,1,0,0,0,0};
        int val = 0;
        System.out.println(threeSum(arr,val));
    }
    public static List<List<Integer>> threeSum(int[] nums , int val) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
         int j = i + 1;
         int k = nums.length - 1;
         while(j < k) {
             int sum = nums[i] + nums[j] + nums[k];
             if(sum == val){
                 list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                 while(j < k &&  nums[j] == nums[j - 1]) j++;
                 j++;
             }
             else if(sum < val){
                 j++;
             } else {
                 k--;
             }
         }
        }
        return list;
    }
}