import java.util.Scanner;

public class MatrixMultiplication {

    // Divide and Conquer Matrix Multiplication
    static void multiply(int[][] A, int[][] B, int[][] C,
                         int aRow, int aCol,
                         int bRow, int bCol,
                         int cRow, int cCol,
                         int rowsA, int colsA, int colsB) {

        if (rowsA == 1 && colsA == 1 && colsB == 1) {
            C[cRow][cCol] += A[aRow][aCol] * B[bRow][bCol];
            return;
        }

        if (rowsA >= colsA && rowsA >= colsB && rowsA > 1) {
            int mid = rowsA / 2;

            multiply(A, B, C,
                    aRow, aCol,
                    bRow, bCol,
                    cRow, cCol,
                    mid, colsA, colsB);

            multiply(A, B, C,
                    aRow + mid, aCol,
                    bRow, bCol,
                    cRow + mid, cCol,
                    rowsA - mid, colsA, colsB);

        } else if (colsB >= colsA && colsB > 1) {

            int mid = colsB / 2;

            multiply(A, B, C,
                    aRow, aCol,
                    bRow, bCol,
                    cRow, cCol,
                    rowsA, colsA, mid);

            multiply(A, B, C,
                    aRow, aCol,
                    bRow, bCol + mid,
                    cRow, cCol + mid,
                    rowsA, colsA, colsB - mid);

        } else {

            int mid = colsA / 2;

            multiply(A, B, C,
                    aRow, aCol,
                    bRow, bCol,
                    cRow, cCol,
                    rowsA, mid, colsB);

            multiply(A, B, C,
                    aRow, aCol + mid,
                    bRow + mid, bCol,
                    cRow, cCol,
                    rowsA, colsA - mid, colsB);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter Matrix A:");

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");

        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        long start = System.nanoTime();

        multiply(A, B, C,
                0, 0,
                0, 0,
                0, 0,
                r1, c1, c2);

        long end = System.nanoTime();

        System.out.println("\nResult Matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nExecution Time: " + (end - start) + " ns");

        sc.close();
    }
}