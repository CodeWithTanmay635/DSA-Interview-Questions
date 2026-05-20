package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {5,4,3,2,1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n; i++) {
           for(int j = 1; j <n-i; j++){
               if(arr[j-1] > arr[j]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j - 1] = temp;

               }

           }
        }
    }

    public static void sortArray(int[] nums){
        Arrays.sort(nums);
    }
}
