package com.mycompany.allassignment;
import java.util.Scanner;
public class ReversofaNumber {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, temp, num;
        int sum=0;
        System.out.print("Enter any positive number:");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println(sum);

    }
    
}
