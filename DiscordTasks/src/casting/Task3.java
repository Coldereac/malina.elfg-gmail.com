package casting;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(), surname = scanner.next(), otchestvo = scanner.next();
        System.out.println("Фамилия: " + surname + "\nИмя: " + name + "\nОтчество: " + otchestvo);
        System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s", surname, name, otchestvo);
    }
}
