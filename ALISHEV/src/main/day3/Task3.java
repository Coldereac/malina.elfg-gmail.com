package main.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dividend, divisor;
        for (int i = 0; i < 5; i++) {
            dividend = scanner.nextDouble();
            divisor = scanner.nextDouble();
            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend / divisor);
            System.out.println(";ev");
        }
    }
}
