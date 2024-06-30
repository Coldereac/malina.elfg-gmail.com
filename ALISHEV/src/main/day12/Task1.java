package main.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Lada");
        cars.add("Toyota");
        cars.add("Porsche");
        for (String car : cars) {
            System.out.println(car);
        }
        cars.add(2, "Lexus");
        cars.removeFirst();
        for (String car : cars) {
            System.out.println(car);
        }
        //Test
    }
}
