package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age :");
        byte age = sc.nextByte();
        System.out.println("Age : " + age);

        System.out.println("Enter Marks : ");
        //short cut command alt + ctrl + v  for Variable
        short marks = sc.nextShort();
        System.out.println("Marks : " + marks);

        System.out.println("Enter your Salary :");
        int salary = sc.nextInt();
        System.out.println("Salary : " + salary);

        System.out.println("Enter your Phone Number :");
        long phoneNumber = sc.nextLong();
        System.out.println("Phone Number : " + phoneNumber);

        System.out.println("Enter Discount :");
        float discount = sc.nextFloat();
        System.out.println("Discount : " + discount);

        System.out.println("Enter Avarage Marks");
        double averageMarks = sc.nextDouble();
        System.out.println("Avarage Marks : " + averageMarks);

        System.out.println("Enter your Gender");
        char gender = sc.next().charAt(0);
        System.out.println("Gender : " + gender );

        System.out.println("Is Stock Available True/False");
        boolean isStockAvailable = sc.nextBoolean();
        System.out.println("Is Stock Available : " + isStockAvailable);

        sc.close();

    }
}