
package com.mycompany.allassignment;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        }

        System.out.println("Sum of number=" + sum);
        System.out.println("Average =" + sum / 5);

        double max = number[0];
        for (int i = 1; i < 5; i++) {
            if (max <number[i]) {
                max = number[i];

            }
        }
        System.out.println("Maximum number = " + max);
        double min = number[0];
        for (int i = 1; i < 5; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Minimum number: " + min);
    }
}
