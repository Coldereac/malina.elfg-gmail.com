package cyclesPractice;

import java.time.Year;

public class Task3 {
    public static void main(String[] args) {
        final int initialYear = 1626;
        double price = 24;
        final int percent = 5;
        for (int i = initialYear; i < Year.now().getValue(); i++) {
            price += price * percent / 100;
        }
        System.out.println(price);
    }
}
