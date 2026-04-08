package com.java.fundamentals;

import java.util.Scanner;

public class PriceCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Product Price :");
        int productPrice = sc.nextInt();


        System.out.println("Enter Your Membership D(Diamond) / G(Gold) / S(Silver) / B(Bronze) ");
        char membershipType = sc.next().charAt(0);


        System.out.println("Enter Your Age : ");
        byte age = sc.nextByte();

        System.out.println("Discount Percentage ");
        double discountPercentage = sc.nextDouble();

    }
}
