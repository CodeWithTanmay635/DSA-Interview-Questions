package LeetcodeProblems;

import java.util.Set;

public class Leetcode_1456MaxVowels {
        public static void main(String[] args) {
            String s = "leetcode";
            int k = 3;
            System.out.println(maxVowels(s, k));
        }

        public static int maxVowels(String s, int k){
            int count = 0;
            int maxCount = 0;
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            for(int i = 0; i < s.length(); i++){
                if(vowels.contains(s.charAt(i))) count++;
                if(i >= k && vowels.contains(s.charAt(i - k))) count--;
                maxCount = Math.max(maxCount, count);
            }
            return maxCount;
        }
}
