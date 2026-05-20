package DSA_Patterns;

public class FixedWindow {
    static void main() {
        int[] arr = {34,5,76,8,3,56};
        int k = 4;
        int maximum =max(arr,k);
        System.out.println(maximum);
    }
    static int max(int[] arr,int k){
      int n = arr.length;
      if(n < k) return -1;

      int windowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
        }
       int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
