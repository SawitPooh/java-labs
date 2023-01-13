package janpan.sawit.lab4;

/**
 * This DisplayMatrix program will show:
 *  showMatrix() show the original matrix that has been entered.
    showMatrixByRow() shows the matrix by row.
    showMatrixByColumn() shows the matrix by column.
    showMatrixByRowBackward() shows the matrix by row backward.
    showMatrixByColumnBackward() shows the matrix by column backward.
    showMatrixByDiagonalTopLeftBottomRight() shows the diagonal elements of the matrix from the top left to the bottom right.
    showMatrixByDiagonalTopRightBottomLeft() shows the diagonal elements of the matrix from the top right to the bottom left.
    showMatrixByRowZigzag() shows the matrix by row zigzag

 *
 * @author : Sawit Janpan
 * ID: 653040463-7
 * Sec: 2
 * @version 1.0 Date: January 13, 2023
 **/

import java.util.Scanner;

public class DisplayMatrix {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of the matrix (number of rows then number of columns) : ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(String.format("Enter element at row " + r + " column " + c + " : "));
                matrix[r][c] = scanner.nextInt();
            }
        }
        System.out.println("Show the original matrix :");
        calculate(matrix);

        showMatrixByRow(matrix);

        showMatrixByColumn(matrix);

        showMatrixByRowBackward(matrix);

        showMatrixByColumnBackward(matrix);

        showMatrixByDiagonalTopLeftBottomRight(matrix);

        showMatrixByDiagonalTopRightBottomLeft(matrix);

        showMatrixByRowZigzag(matrix);
    }

    public static void calculate(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void showMatrixByRow(int[][] matrix) {
        System.out.print("Show the matrix by row : ");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixByColumn(int[][] matrix) {
        System.out.print("Show the matrix by column : ");
        for (int r = 0; r < (matrix[0].length); r++) {
            for (int c = 0; c < (matrix.length); c++) {
                System.out.print(matrix[c][r] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixByRowBackward(int[][] matrix) {
        System.out.print("Show the matrix by row backward : ");
        for (int r = matrix.length - 1; r >= 0; r--) {
            for (int c = matrix[0].length - 1; c >= 0; c--) {
                System.out.print(matrix[r][c] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixByColumnBackward(int[][] matrix) {
        System.out.print("Show the matrix by column backward : ");
        for (int r =  matrix[0].length-1; r >= 0; r--) {
            for (int c = matrix.length-1; c >= 0 ; c--) {
                System.out.print(matrix[c][r] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixByDiagonalTopLeftBottomRight(int[][] matrix) {
        System.out.print("Show the matrix by diagonal top-left to bottom-right : ");
        for (int r = 0; r < (matrix.length - (r++)); r++) {
            for (int c = 0; c < (matrix.length); c++) {
                System.out.print(matrix[c][c] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixByDiagonalTopRightBottomLeft(int[][] matrix) {
        System.out.print("Show the matrix by diagonal top-right to bottom-left : ");
        
        System.out.println();
    }

    public static void showMatrixByRowZigzag(int[][] matrix) {
        System.out.print("Show the matrix by row zigzag : ");

        System.out.println();
    }

}