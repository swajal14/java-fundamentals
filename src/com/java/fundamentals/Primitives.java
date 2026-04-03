package com.java.fundamentals;

public class Primitives {
    static void main(String[] args) {
      //Primitives
      //byte
      //stores 1 bytes of memory
      //range : -128 to +127
      byte age;
      byte subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
      age = 21;
      subject1Marks = 50;
      subject2Marks = 90;
      subject3Marks = 75;
      subject4Marks = 99;
      subject5Marks = 88;
        System.out.println("Age: " + age);
        System.out.println("Subject 1 Marks: " + subject1Marks + ", Subject 2 Marks: " + subject2Marks + ", Subject 3 Marks: " + subject3Marks + ", Subject 4 Marks: "
                + subject4Marks + ", Subject 5 Marks: " + subject5Marks );

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Subject 4 Marks: " + subject4Marks);
        System.out.println("Subject 4 Marks: " + subject5Marks);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        //short
        //stores 2 bytes of memory
        //range : -32768 to +32767
        short totalMarks = 544;
        System.out.println("Total Marks: " + totalMarks);



        short manufacturingYear = 2022;
        short daysInExpiry = 150;

        System.out.println("Manufacturing Year: " + manufacturingYear + ", Days in Expiry: " + daysInExpiry);


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        //int
        //stores 4 bytes of memory
        //range : -2147483648 to +2147483647
        /*Integer Variables
         Salary
         OTP
         Price*/

        int price = 50000000;
        int salary = 99999999;
        int otp = 5413435;

        System.out.println("Price of the Dress: " + price);
        System.out.println("Salary of the Month: " + salary);
        System.out.println("Your OTP: " + otp);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        /*
        long
        stores 8 bytes of memory
        we have to add L to the value of long ( or l)
        example:-  long mobileNo = 8308686856L
         */

        long mobileNo = 8309865325L;
        long aadharNo = 142536789654L;
        long debitCardNo = 789456123968L;

        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Aadhar Number: " + aadharNo);
        System.out.println("Debit Card Number:" + debitCardNo);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");




    }
    }

