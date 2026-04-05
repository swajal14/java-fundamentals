package com.java.fundamentals;

public class Operators {
    static void main(String[] args) {

        byte no1 = 100;
        byte no2;
        no2 = no1;
        System.out.println(no2);
        int res = 10 + 20 - 30 * 40 / 50 % 60;
        System.out.println(res);

        byte b1 = 127;
        byte b2 = 127;
        short res1 = (short) (b1  + b2);
        System.out.println(res1);


        int num1 = 100146544;
        int num2 = 25645552;
        long sum = num1 + num2;
        System.out.println(sum);


        num1 = 8745;
        num2 = 4556;
        res = --num1 + ++num2 - --num2 + --num1 - num2++;
        System.out.println(res);
        System.out.println(num1);
        System.out.println(num2);


    }
}
