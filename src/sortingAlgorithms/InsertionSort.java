package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr = {4,3,5,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = i+1 ; j > 0  ; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
