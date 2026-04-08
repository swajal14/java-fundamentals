package com.java.fundamentals;

import java.util.Scanner;

public class PrintEvenNumbers {
    static void main(String[] args) {
        /*
        * 1. Take Inputs (Range)
        * 2. Print all even numbers in the range
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range ");
        int userInput = scanner.nextInt();
        int n = 1;
        while (n <= userInput ) {
            if (n % 2 == 0)
                System.out.println(n);
            n++;
        }


    }
}
