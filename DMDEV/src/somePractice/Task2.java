package somePractice;

import java.util.Scanner;

public class Task2 {

    public static void executeTask2() {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());
        if (input % 10 == 3) System.out.println("Yes");
        else System.out.println("No");
    }
}
