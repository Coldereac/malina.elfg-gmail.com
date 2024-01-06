package console;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next()), b = Integer.parseInt(scanner.next());
        System.out.println(a * a * a > b * b);
    }
}
