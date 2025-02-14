/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlstatement;

import java.util.Scanner;
/**
 *
 * @author naimu
 */
public class VowelConsonent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character:");
        ch=  input.next().charAt(0);
        if(ch =='a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u') {
            System.out.print(ch+" is a vowel");
            
        }
        else{
            System.out.print(ch+" is a consonent");
        }
        
    }
}
    