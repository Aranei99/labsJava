package com.aranei.var2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class n82 {
    public void testV82() {
        // Задаем поле из NxN клеток
        int[][] field = {
                {0, 0, 0, 0, 0, 0, 0, 0},   // ▢▢▢▢▢▢▢▢
                {0, 1, 1, 0, 1, 0, 1, 0},   // ▢▩▩▢▩▢▩▢
                {0, 1, 0, 0, 1, 0, 1, 0},   // ▢▩▢▢▩▢▩▢
                {0, 0, 0, 0, 1, 0, 1, 0},   // ▢▢▢▢▩▢▩▢
                {0, 0, 0, 0, 0, 0, 0, 0},   // ▢▢▢▢▢▢▢▢
                {0, 1, 0, 0, 1, 1, 1, 0},   // ▢▩▢▢▩▩▩▢
                {0, 1, 1, 0, 1, 1, 1, 0},   // ▢▩▩▢▩▩▩▢
                {0, 0, 0, 0, 0, 0, 0, 0}    // ▢▢▢▢▢▢▢▢
        };
        System.out.println("Дано:");
        outArray(field);

        ArrayList<int[][]> figureList = new ArrayList<>();

        int[][] fieldTemplate = new int[field.length][field[0].length];
        clearArray(fieldTemplate);

        int show = 0;


        HashSet<int[][]> figures = new HashSet<>();

        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                if(field[y][x] == 1) {
                    recursionCheck(x, y, fieldTemplate, field);
                    if(show == 0){
                        figureList.add(resizeArray(fieldTemplate));

//                    outArray(figureList.get(show));

//                    System.out.println();
                        figures.add(figureList.get(show));
                        show++;
                    }
                    if (checkRotate(figureList,resizeArray(fieldTemplate))){
                        figureList.add(resizeArray(fieldTemplate));
                        figures.add(figureList.get(show));
                        show++;
                    }
                    clearArray(fieldTemplate);
                }
            }
        }

        System.out.println("Всего фигур: " + figures.size() + "\n");
        for (int[][] f : figures) {
            outArray(f);
            System.out.println();
        }
    }

    private void clearArray(int[][] array){
        for (int[] row: array)
            Arrays.fill(row, 0);
    }

    private void outArray(int[][] array){
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private void recursionCheck(int x, int y, int[][] figure, int[][] field){
        if (x>0 & x<field[0].length & y>0 & y<field.length)

        if (figure[y][x] != 1) {
            if(field[y][x] == 1) {
                figure[y][x] = field[y][x];
                recursionCheck(x+1, y, figure, field);
                recursionCheck(x, y+1, figure, field);
                recursionCheck(x-1, y, figure, field);
                recursionCheck(x, y-1, figure, field);
            }
        }
    }
    private int[][] resizeArray(int[][] array){
        //           xMax  yMax    xMin            yMin
        int[] minMax = {0, 0, array[0].length, array.length};


        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                 if(array[y][x] == 1) {
                    if(minMax[0] < x) minMax[0] = x;
                    if(minMax[1] < y) minMax[1] = y;
                    if(minMax[2] > x) minMax[2] = x;
                    if(minMax[3] > y) minMax[3] = y;
                }
            }
        }
//        outArray(array);
//        System.out.println(Arrays.toString(minMax));
        int[][] result = new int[minMax[1] - minMax[3] + 1][minMax[0] - minMax[2] + 1];


        for (int y = minMax[3]; y < minMax[1] + 1; y++) {
            for (int x = minMax[2]; x < minMax[0] + 1; x++) {
                result[y-minMax[3]][x-minMax[2]] = array[y][x];
                }
            }
//        outArray(result);
        return result;
    }

    private boolean checkRotate(ArrayList<int[][]> list,  int[][] array){
        boolean add = true;
        for (int[][] ints : list) {
            if (ints.length == array.length | ints.length == array[0].length |
                    ints[0].length == array.length | ints[0].length == array[0].length) {
                if (Arrays.deepEquals(ints, array)) add = false;
                if (Arrays.deepEquals(ints, arrayRotate(array))) add = false;
                if (Arrays.deepEquals(ints, arrayRotate(arrayRotate(array)))) add = false;
                if (Arrays.deepEquals(ints, arrayRotate(arrayRotate(arrayRotate(array))))) add = false;
            }
        }
//        System.out.println(add);
        return add;
    }

    private int[][] arrayRotate(int[][] array){
        int[][] resultArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[j][array.length - i - 1] = array[i][j];
            }
        }
        return resultArray;
    }
}
