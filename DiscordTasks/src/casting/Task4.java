package casting;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next()), b = Integer.parseInt(scanner.next());
        if (a % 2 == 0 || b % 3 == 0) System.out.println(a == b);
        if (a % 2 == 0 && a % 3 == 0) {
            double pow = Math.pow(a, b);
            if (pow < Integer.MAX_VALUE && pow > Integer.MIN_VALUE)
                System.out.println((int) pow);
            else
                System.out.println("Результат выражения слишком большой");
        }
    }
}
