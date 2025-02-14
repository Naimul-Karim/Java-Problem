

package com.mycompany.versitywork;

import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {
        Scanner inpur = new Scanner(System.in);
        int x;
        int fact=1;
        System.out.print("Enter a number for factorial:");
        x= inpur.nextInt();
        for(int i =1 ; i<=x ; i++){
            fact = fact * i;
        }
        System.out.printf("factorial %5d",fact);
        
    }
}
