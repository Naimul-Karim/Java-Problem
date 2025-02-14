package com.mycompany.versitywork;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num, count = 0;

        System.out.println("Enter a number:");
        num = number.nextInt();
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        }else{
        for (int i = 2; i < num; i++) {

            if (num % 2 == 0) {
                count++;
                break;
            }
        }
        }
        if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is a prime number");

        }
    }

}
