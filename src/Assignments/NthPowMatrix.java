package Assignments;

import java.util.Scanner;

public class NthPowMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimension from user input
        System.out.print("Enter matrix size: ");
        int dim = scanner.nextInt();

        // Create matrices to store A, Ak-1, and the result
        double[][] a = new double[dim][dim]; // store original matrix
        double[][] b = new double[dim][dim]; // for calculation
        double[][] c = new double[dim][dim]; // final result

        // Get elements of matrix A from user
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("a" + (i + 1) + "" + (j + 1) + "=");
                a[i][j] = scanner.nextDouble();
            }
        }

        // Get the power n from user
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Calculate An iteratively
        for (int k = 1; k <= n; k++) {
            if (k == 1) {
                // Initialize b with A for the first iteration
                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        b[i][j] = a[i][j];
                    }
                }
            } else {
                // Perform matrix multiplication C = BA
                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        c[i][j] = 0;
                        for (int p = 0; p < dim; p++) {
                            c[i][j] += b[i][p] * a[p][j];
                        }
                    }
                }

                // Copy the result back to b for the next iteration
                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        b[i][j] = c[i][j];
                    }
                }
            }
        }

        // Print the final result (An)
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("%.1f \t", c[i][j]); // Format output with one decimal place
            }
            System.out.println();
        }

        scanner.close();
    }
}