package com.mycompany.versitywork;

import java.util.Scanner;

public class VersityWork {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter student ID: ");
        int studentID =input.nextInt();

        System.out.print("Enter student age: ");
        int studentAge = input.nextInt();

        System.out.print("Enter student fee: ");
        float studentFee = input.nextFloat();

        System.out.print("Enter student grade: ");
        char studentGrade = input.next().charAt(0);

        
        System.out.println("\nStudent Details:");
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        input.close();
    }
}
    
