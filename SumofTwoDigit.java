package com.mycompany.versitywork;

import java.util.Scanner;

public class SumofTwoDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double num1, num2;
        double sum = 0;
        
        System.out.print("Enter a number:");
        num1 = input.nextDouble();
        
        System.out.print("Enter another number:");
        num2 = input.nextDouble();
        
        sum = num1 + num2;
        
        System.out.println("Sum of numbers=" + sum);
    }
}
