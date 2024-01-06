package main.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int i = a+1;
        if (a % 2 == 0) i++;
        while (i < b){
            if (i % 5 == 0) System.out.print(i + " ");
            i += 2;
        }
    }
}
