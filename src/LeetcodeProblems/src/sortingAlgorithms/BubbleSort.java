package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    static void main() {
        int[] arr = {5,4,3,2,1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.remove("B");

        System.out.println(list);
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
