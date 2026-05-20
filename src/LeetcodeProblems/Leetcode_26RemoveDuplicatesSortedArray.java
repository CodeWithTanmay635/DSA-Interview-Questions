package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Leetcode_26RemoveDuplicatesSortedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int slow = 0;
        int input;
        System.out.println("Enter Numbers To Add In List & Enter '-1' To Stop Adding:");

        while (true){
            input = sc.nextInt();
            if(input == -1) break;
            list.add(input);
        }
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {

            if (!Objects.equals(list.get(i), list.get(slow))) {
                slow++;
                list.set(slow,list.get(i) );
            }
        }
        System.out.println((slow + 1));
        System.out.println("Modified list: " + list.subList(0, slow + 1));
    }
}
