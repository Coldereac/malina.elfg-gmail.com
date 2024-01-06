package main.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt()+1, b = scanner.nextInt();
        if (a % 2 == 0) a++;
        for (int i = a; i < b; i+=2) {
            if (i % 5 == 0) System.out.print(i + " ");
        }
    }
}
