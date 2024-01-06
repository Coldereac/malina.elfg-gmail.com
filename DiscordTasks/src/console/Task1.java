package console;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.next()), b = Double.parseDouble(scanner.next());
        System.out.println(b * a * (a + b) / (a * a));
        int aInt = (int) a, bInt = (int) b;
        System.out.println(bInt * aInt * (aInt + bInt) / (aInt * aInt));
    }
}
