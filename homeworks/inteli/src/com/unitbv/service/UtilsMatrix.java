package com.unitbv.service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class UtilsMatrix {
    private Scanner scanner = new Scanner(System.in);

    public UtilsMatrix() {
    }

    /**
     * Read a int [ ] [ ] (matrix) from the keyboard
     *
     * @param n the n
     * @param m the m
     * @return the int [ ] [ ]
     */
    public int[][] read(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("m[" + i + "]" + "[" + j + "]= ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    /**
     * Print a given matrix.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     */
    public void print(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * A method who create a vector with
     * downTriangle elements.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public ArrayList<Integer> downTriangle(int[][] matrix, int n, int m) {
        ArrayList<Integer> vectordowntriangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j < i) {
                    vectordowntriangle.add(matrix[i][j]);
                }
            }

        }
        return vectordowntriangle;
    }

    /**
     * A method who create a vector with
     * upTriangle elements.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public ArrayList<Integer> upTriangle(int[][] matrix, int n, int m) {
        ArrayList<Integer> uptriangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j > i) {
                    uptriangle.add(matrix[i][j]);
                }
            }

        }
        return uptriangle;
    }

    /**
     * A method who create a vector with
     * upSecondaryTriangle elements.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public ArrayList<Integer> upSecondaryTriangle(int[][] matrix, int n, int m) {
        ArrayList<Integer> vectorupsecondarytriangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j > n)
                    vectorupsecondarytriangle.add(matrix[i][j]);
            }
        }
        return vectorupsecondarytriangle;
    }

    /**
     * A method who create a vector with
     * downSecondaryTriangle elements.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public ArrayList<Integer> downSecondaryTriangle(int[][] matrix, int n, int m) {
        ArrayList<Integer> vectordownsecondarytriangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j < n)
                    vectordownsecondarytriangle.add(matrix[i][j]);
            }
        }
        return vectordownsecondarytriangle;
    }

    /**
     * A method who create a vector with
     * elements from Nord Triangle.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public ArrayList<Integer> NordTriangle(int[][] matrix, int n, int m) {
        ArrayList<Integer> vectornordtriangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j && i + j < n)
                    vectornordtriangle.add(matrix[i][j]);
            }
        }
        return vectornordtriangle;
    }

    /**
     * A method who create a vector with
     * elements from Sud Triangle.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public Vector<Integer> SudTriangle(int[][] matrix, int n, int m) {
        Vector<Integer> vectorsudtriangle = new Vector<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > j && i + j > n)
                    vectorsudtriangle.add(matrix[i][j]);
            }
        }
        return vectorsudtriangle;
    }

    /**
     * A method who create a vector with
     * elements from Est Triangle.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public Vector<Integer> EstTriangle(int[][] matrix, int n, int m) {
        Vector<Integer> vectoresttriangle = new Vector<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j && i + j > n)
                    vectoresttriangle.add(matrix[i][j]);
            }
        }
        return vectoresttriangle;
    }

    /**
     * A method who create a vector with
     * elements from Vest Triangle.
     *
     * @param matrix the matrix
     * @param n      the n
     * @param m      the m
     * @return the vector
     */
    public Vector<Integer> VestTriangle(int[][] matrix, int n, int m) {
        Vector<Integer> vectorvesttriangle = new Vector<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > j && i + j < n)
                    vectorvesttriangle.add(matrix[i][j]);
            }
        }
        return vectorvesttriangle;
    }
}

