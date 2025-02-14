
package com.mycompany.allassignment;

import java.util.Scanner;

public class UsernameAndPasseword {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             String username, password;
             while (true) {
                 System.out.print("Enter username: ");
                 username = scanner.nextLine();
                 
                 System.out.print("Enter password: ");
                 password = scanner.nextLine();
                 
                 if (username.equals("anis") && password.equals("123456")) {
                     System.out.println("Welcome to the system");
                     break; // Exit the loop when the correct credentials are entered
                 } else {
                     System.out.println("Username/password is incorrect. Please try again.");
                     continue; // Restart the loop from the beginning
                 }
             }}
    }
}
