package main.day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        final int size = 100;
        int[] array = new int[size];
        int min, max, numberEndsOn0 = 0, sumEndsOn0 = 0;
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 10001);
        }
        min = 10001;
        max = -1;
        for (int i: array){
            if (max < i) max = i;
            if (min > i) min = i;
            if (i % 10 == 0){
                numberEndsOn0++;
                sumEndsOn0 += i;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Number of numbers that ends on 0: " + numberEndsOn0 + " Sum of this elements: " + sumEndsOn0);
    }
}
