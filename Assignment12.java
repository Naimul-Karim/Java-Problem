
package com.mycompany.allassignment;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner odd= new Scanner(System.in);
        int num, sum=0;
        System.out.print("Enter the last number for sum of odd:");
        num = odd.nextInt();
        for (int i = 0; i <= num; i++) {
            if(i%2 != 0){
                sum = sum + i;
            }
            
        }
        System.out.println("Sum of odd till 19 = "+sum);
    }
    
}
