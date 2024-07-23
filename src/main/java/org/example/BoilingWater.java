package org.example;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature:");
        int temperature = scanner.nextInt();

        if (temperature >= 212) {
            System.out.println("Water is boiling!");
        }
    }
}