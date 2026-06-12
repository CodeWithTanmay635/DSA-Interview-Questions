package LeetcodeProblems;


public class Leetcode_643MaxAvg {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println((sum(arr, k)));
    }

    public static double sum(int[] arr, int k){
        var currentSum = 0;

        for(var i = 0; i < k; i++){
            currentSum += arr[i];
        }

        var maxSum = currentSum;

        for(int i = k; i < arr.length; i++){
            currentSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return (double) maxSum /k;
    }
}
