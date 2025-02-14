/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment4;

import java.util.Scanner;


public class Installment {
     public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      int phonePrice = 1800; // 1800 euros
      int numberOfInstallment, installmentPerMonth;

      System.out.print("Number of installments? ");
      // get number of installments from user
      numberOfInstallment = input.nextInt();
     

      // calculate  installment amount for per month
      installmentPerMonth = phonePrice / numberOfInstallment;
    

        System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
    } 

  }
    
}
