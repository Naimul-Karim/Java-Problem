/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.allassignment;

import java.util.Scanner;

/**
 *
 * @author naimu
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, temp, num;
        int sum=0;
        System.out.print("Enter any positive number:");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
            r = temp % 10;
            sum = sum + r*r*r;
     
             temp = temp / 10;
        }
        if(num == sum) {
            System.out.println(num+" is a armstrong number");
        }
        else{
            System.out.println(num+" is not a armstrong number");
        }
        System.out.println(sum);

    }
}
