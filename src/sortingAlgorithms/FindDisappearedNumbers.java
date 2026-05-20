package sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

class FindDisappearedNumbers {
    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == index+1) {
                if(arr[index] != index +1){
                    list.remove(index);
                }
                list.add(index+1);
            }else return list;
        }
        return null;
    }


    public static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
