package com.mycompany.versitywork;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1;
        int temp = 0, n;
        System.out.print("Enter How many numbers you want in your fibonacci series:");
        n = input.nextInt();
        System.out.printf("Fibonacci Series: %d %d", a, b);
        for (int i = 3; i <= n; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b =  temp;

        }
    }

}
