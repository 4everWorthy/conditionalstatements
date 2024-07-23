package org.example;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scanner.next();

        System.out.println("Enter the second word:");
        String word2 = scanner.next();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
