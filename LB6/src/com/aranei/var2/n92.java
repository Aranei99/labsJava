package com.aranei.var2;

import java.util.Arrays;
import java.util.Stack;

public class n92 {
    public void testN92() {
        int n = 5;
        int[][] field = new int[n][n];
        int[][] fieldTemplate = new int[field.length][field[0].length];
        clearArray(fieldTemplate);

        Stack<int[][]> stacks = new Stack<>();
        for (int i = 0; i != n; i++) {
            for (int j = 0; j != n; j++) {
                field[i][j] = (int) (Math.random() * 3 + 1);
                System.out.print(field[i][j] + " ");

            }
            System.out.println();
        }


        for (int i = 0; i != n; i++) {
            for (int j = 0; j != n; j++) {
                stacks.push(arrayCheck(i, j, field));
            }
        }

        int[][] maxArray = new int[1][1];
        while (!stacks.isEmpty()){
            int[][] local = stacks.pop();
            if ((maxArray.length + 1) * (maxArray[0].length + 1) < (local.length + 1) * (local[0].length + 1)) {
                maxArray = local;
//                        System.out.println(Arrays.toString(s));
            }
        }
        outArray(maxArray);

    }


    private void clearArray(int[][] array){
        for (int[] row: array)
            Arrays.fill(row, 0);
    }

    private int[][] arrayCheck(int x, int y, int[][] field) {
        int ySize = 0;
        int xSize = 0;
        int[] s = {0, 0, 0};

        boolean check = true;

        for (int j = y; j < field.length; j++){
            for (int i = x; i < field[0].length; i++) {
                for (int j2 = y; j2 <= j; j2++) {
                    if (field[j2][i] != field[y][x]) {
                        check = false;
                        j2 = j;
                    }
                    if (check & ((xSize + 1) * (ySize + 1)) > s[2]) {
                        s[0] = xSize + 1;
                        s[1] = ySize + 1;
                        s[2] = (xSize + 1) * (ySize + 1);
//                        System.out.println(Arrays.toString(s));
                    }
                    ySize++;
                }
                xSize++;
                ySize = 0;

            }
            check = true;
            xSize = 0;
    }
//        System.out.println(Arrays.toString(s));
        int[][] result = new int[s[1]][s[0]];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = field[y + i][x + j];
            }
        }

        return result;
    }

    private void outArray(int[][] array){
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
    }
}
