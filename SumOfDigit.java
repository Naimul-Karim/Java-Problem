
package com.mycompany.allassignment;

import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, temp, num, m,n;
        int sum=0;
        System.out.print("Enter starting number:");
        m = input.nextInt();
        System.out.print("Enter ending number:");
        n = input.nextInt();
        int totalarmstrongNumber = 0;
        for(int i =m; i<=n ;  i++){
            temp= i;
        while(temp!=0){
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
        }
        if ( i== sum)
        System.out.println("Armstrong number "+i);
   
    }
    System.out.println("Total armstrong number" + totalarmstrongNumber);
}
}
