package main.day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("India", 2000, 73.5f, 507.33f);
        airplane.setYear(1999);
        airplane.setLength(80f);
        airplane.fillUp(20f);
        airplane.fillUp(33.33333333f);
        airplane.info();
    }
}
