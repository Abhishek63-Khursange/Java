package Java.Array;

import java.util.Scanner;

public class MultiofTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][2];
        int brr[][] = new int[2][2];
        int crr[][] = new int[2][2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                crr[i][j] = 0; // initialize before summing
                for (int k = 0; k < arr[i].length; k++) {
                    crr[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }

        // Print first matrix
        System.out.println("First Matrix:");
        for (int[] row : arr) {
            for (int a : row) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        // Print second matrix
        System.out.println("Second Matrix:");
        for (int[] row : brr) {
            for (int a : row) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        // Print result
        System.out.println("Product Matrix:");
        for (int[] row : crr) {
            for (int a : row) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
