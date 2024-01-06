package main.day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dividend = scanner.nextDouble(), divisor = scanner.nextDouble();
        while (divisor != 0){
            System.out.println(dividend / divisor);
            dividend = scanner.nextDouble();
            divisor = scanner.nextDouble();
        }
    }
}
