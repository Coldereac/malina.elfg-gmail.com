package casting;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        /*if (input.equals("Hi")) System.out.println("Hello");
        else if (input.equals("Bye")) System.out.println("Goodbye");
        else if (input.equals("How are you?")) System.out.println("How are you doing?");
        else System.out.println("Unknown message");*/

        switch (input) {
            case "Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Goodbye");
            case "How are you?" -> System.out.println("How are you doing?");
            default -> System.out.println("Unknown message");
        }
    }
}
