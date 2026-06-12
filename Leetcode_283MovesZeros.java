package LeetcodeProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode_283MovesZeros {
    static void main() {
        try(Scanner sc = new Scanner(System.in)){
            List<Integer> list = new ArrayList<>();
        System.out.println("Enter Number In List & Enter '-1' To Stop Adding:");
        int input;
        while(true){
            input = sc.nextInt();
            if(input == -1){
                break;
            }
            list.add(input);
        }
        System.out.println("Original List : "+list);
        int left = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != 0){
                int temp = list.get(left);
                list.set(left,list.get(i));
                list.set(i,temp);
                left++;
            }
        }
        System.out.println("List When Zeros Are Moved To Last : "+list);
            }catch (NullPointerException e){
            e.getMessage();
        }
    }
}
