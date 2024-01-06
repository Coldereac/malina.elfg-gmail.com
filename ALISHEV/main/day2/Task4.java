package main.day2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal number = scanner.nextBigDecimal();
        if (number.compareTo(new BigDecimal(5)) >= 0){
            System.out.println(number.pow(2).add(new BigDecimal(-10)).divide(number.add(new BigDecimal(7)), 15, RoundingMode.UP));
        } else if (number.compareTo(new BigDecimal(-3)) > 0) {
            System.out.println(number.add(new BigDecimal(3)).multiply(number.pow(2).add(new BigDecimal(-2))));
        }
        else {
            System.out.println(420);
        }
    }
}
