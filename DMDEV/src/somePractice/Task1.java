package somePractice;

import java.util.Scanner;

public class Task1 {
    public static void executeTask1(){
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());
        if (input < 1 || input > 12) System.out.println("Wrong input");
        else if (input < 3 || input == 12) System.out.println("Зима");
        else if (input < 6) System.out.println("Весна");
        else if (input < 9) System.out.println("Лето");
        else System.out.println("Осень");
    }
}
