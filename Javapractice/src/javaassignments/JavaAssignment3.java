package javaassignments;
import java.util.Scanner;

public class JavaAssignment3 {

    public static void main(String[] args) {
    	
        int[][] matrix = new int[3][3];
        
        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("Enter 3 by 3 matrix:");
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        // Output
        System.out.println("Matrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}


// Test case 1: single digit per line - success.
// Test case 2: each digit separated by space - success.
