package com.mycompany.allassignment;

public class Twodarray {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {2, 3, 4}, {4, 5, 6}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
