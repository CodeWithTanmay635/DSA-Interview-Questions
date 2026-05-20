package sortingAlgorithms;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
            int[] arr = {1,4,2,0};
           int number = missingNumber(arr);
        System.out.println(number);
//            cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] ;
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr,i,arr[i]);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
