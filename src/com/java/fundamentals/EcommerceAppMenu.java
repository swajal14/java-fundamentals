package com.java.fundamentals;

import java.util.Scanner;

public class EcommerceAppMenu {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome to E-Commerce App");

        System.out.println("------------------------------------------------------------------");
        System.out.println("Menu : ");
        System.out.println("1. Customer ");
        System.out.println("2. Order ");
        System.out.println("3. Product ");
        System.out.println("4. Payment ");
        System.out.println("5. Exit ");

        System.out.println("Enter your input: (1-5) ");
        int userOption = scanner.nextInt();
            switch (userOption){
                case 1 :
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Welcome to Customer Section");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("1. Signup");
                    System.out.println("2. Login");
                    System.out.println("Enter your input: (1-2) ");
                    byte CustomerOption = scanner.nextByte();
                        switch (CustomerOption){
                            case 1 :
                                System.out.println("Signup Succesfully");
                                break;
                            case 2 :
                                System.out.println("Login Succesfully");
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                break;
                case 2 :
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Welcome to Order Section");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("1. New Order ");
                    System.out.println("2. Existing Order ");
                    System.out.println("Enter your input: (1-2) ");



            }
    }
}
