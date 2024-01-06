package casting;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next()), b = Integer.parseInt(scanner.next());
        if (a == b) System.out.println("Числа равны");
        if (a % 2 == 0) System.out.println(a * b);
        else System.out.println(a / b);
    }
}
