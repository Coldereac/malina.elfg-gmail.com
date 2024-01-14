package heapAndStackPractice;

import OOP.task1.DateTest;

public class Task1 {
    public static void main(String[] args) {
        DateTest date = createDate();

        DateTest dateWithSeconds = new DateTest(date.getInSeconds());

        System.out.println(dateWithSeconds.getInSeconds());
        System.out.println(dateWithSeconds);
        DateTest dateSum = date.sum(dateWithSeconds);
        System.out.println(dateSum);
    }

    private static DateTest createDate() {
        DateTest date = new DateTest(12, 12, 2);
        System.out.println(date.getInSeconds());
        return date;
    }
}
