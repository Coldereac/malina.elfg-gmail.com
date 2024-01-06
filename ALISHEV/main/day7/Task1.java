package main.day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Yamaha", 10, 22f, 22.5f);
        Airplane airplane2 = new Airplane("A", 10, 200f, 22.5f);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
