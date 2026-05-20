package sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

class FindDuplicateNumbers {
    static void main() {
        int[] arr = {1,2,2,3,4,3};
        System.out.println(findAllDuplicates(arr));
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i+1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else{
                    return arr[i];
                }

            }else{
                i++;
            }
        }

        return -1;
    }

    public static List<Integer> findAllDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;

                if(arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }  else {
                   i++;
                }


        }
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j] != j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }
    public static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}