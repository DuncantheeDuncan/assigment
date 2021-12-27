package net.greet;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\nType in a sentence or words to count the number of words given  or exit");
            String words =scanner.nextLine();
            Class2 class2 = new Class2(words);
            class2.getCount_words();// calling the getCountWords from class2
        }
    }
}
