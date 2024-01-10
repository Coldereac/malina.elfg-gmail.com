package OOP.task1;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        DateTest dateWithSeconds = new DateTest(4615200);
        DateTest date = new DateTest(12, 12, 2);

        System.out.println(dateWithSeconds);
        System.out.println(date);
        System.out.println(date.getInSeconds());
        System.out.println(date.sum(dateWithSeconds));
    }
}
