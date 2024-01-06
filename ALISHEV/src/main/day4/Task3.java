package main.day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        final int m = 3, n = 5;
        int[][] array = new int[m][n];
        int index = 0;
        int tempSum1= -1,tempSum2;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                array[i][j] = (int)(Math.random() * 51);

        for (int i = 0; i < m; i++) {
            tempSum2 = 0;
            for (int j = 0; j < n; j++) {
                tempSum2 += array[i][j];
            }
            if (tempSum1 < tempSum2){
                tempSum1 = tempSum2;
                index = i;
            }
        }
        System.out.println("Array: ");
        for (int[] i: array)
            System.out.println(Arrays.toString(i));
        System.out.println("Max sum line: " + index);
    }
}
