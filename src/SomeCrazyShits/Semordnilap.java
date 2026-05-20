package SomeCrazyShits;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Semordnilap {
    static void main() throws IOException {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        File f = new File("D:\\Java\\DSAInJAVA\\src\\SomeCrazyShits\\words.txt" );
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        while((line = br.readLine()) != null){
            set.add(line);
        }
        System.out.println("Enter the word :");
        String word = sc.nextLine().toLowerCase();

        String reverse = new StringBuffer(word).reverse().toString().toLowerCase();

        if(!set.contains(word)){
            System.out.println("What You Just Entered Is Not A Meaningful Word");
            return;
        }

        if(set.contains(reverse)){
            System.out.println(reverse);
            System.out.println("Is semordnilap");
        }else {
            System.out.println(reverse);
            System.out.println("not semordnilap");
        }

    }
}
