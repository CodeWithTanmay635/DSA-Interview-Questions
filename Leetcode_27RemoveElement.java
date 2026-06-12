package LeetcodeProblems;

public class Leetcode_27RemoveElement {
    static void main() {
        int val = 5;
        int[] arr = {78, 0, 8, 10, 63, -1, 5, 19};
        System.out.println(removeElement(arr,val));
    }

    public static int removeElement(int[] arr, int val){
        int i =0;
        int j =0;
        for ( ;i < arr.length ; i++) {
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
