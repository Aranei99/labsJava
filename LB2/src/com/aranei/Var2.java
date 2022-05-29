package com.aranei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Var2 {
    public String firstTask = "Вычислить определитель матрицы";
    public String secondTask = "Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое";

    double[][] matrix, matrix2;
    public int n;
    Random r = new Random();

    public void getTask(int task) {
        switch (task) {
            case 0:
                System.out.println(firstTask);
                break;
            case 1:
                System.out.println(secondTask);
                break;
        }
    }

    public void getMatrixSize() {
        System.out.println("Matrix size:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        matrix = new double[n][n];
    }

    public void setMatrix() {
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = r.nextDouble() * 100;
            }
        }
        matrix2 = matrix;
    }

    public void showMatrix() {
        System.out.println("Matrix:");
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.format("  %.3f  ",aDouble);
            }
            System.out.println();
        }
    }


    double temp, tempMed;


    public void setMedMatrix() {
        for (int i=0; i<matrix2.length; i++){
            temp = 0;
            for (int j=0; j<matrix2[i].length; j++){
                temp += matrix2[i][j];
            }
            tempMed = temp/matrix2[i].length;
            for (int j=0; j<matrix2[i].length; j++){
                matrix2[i][j] -= tempMed;
            }
        }
        showMatrix2();
    }

    public void showMatrix2() {
        System.out.println("MatrixMed:");
        for (double[] doubles : matrix2) {
            for (double aDouble : doubles) {
                System.out.format("  %.3f  ",aDouble);
            }
            System.out.println();
        }
    }

    public void calcMatrix(){
        Matrix matrixDet = new Matrix(matrix);
        System.out.format("Det:  %.3f\n", matrixDet.determinant());
    }
}

