package main.day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        final int size = 100;
        int[] array = new int[size];
        int sum = 0, index = 0;
        for (int i = 0; i < size; i++)
            array[i] = (int) (Math.random() * 10001);

        for (int i = 0; i < size - 2; i++) {
            int sum2 = array[i] + array[i+1] + array[i+2];
            if (sum < sum2) {
                sum = sum2;
                index = i;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum: " + sum + " Index: " + index);
    }
}

