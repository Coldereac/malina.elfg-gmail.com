package main.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int size = Integer.parseInt(scanner.nextLine());
        final int[] array = new int[size];
        int biggerThan8 = 0, equalTo1 = 0, even = 0, odd = 0, sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 151 - 50);
        }
        System.out.println("Length of array is: " + size); //array.length();
        System.out.println("Array: " + Arrays.toString(array));
        for (int i: array){
            if (i > 8) biggerThan8++;
            if (i == 1) equalTo1++;
            if (i % 2 == 0 && i != 0) even++;
            else if (i != 0) odd ++;
            sum += i;
        }
        System.out.println("Number of numbers bigger than 8: " + biggerThan8);
        System.out.println("Number of numbers that is equal to 1: " + equalTo1);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Sum of all elements in array: " + sum);
    }
}
