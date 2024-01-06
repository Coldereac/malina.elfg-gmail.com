package main.day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1990, "Metallic_black", "Yamaha G500");
        System.out.println("Year: " + motorbike.getYear() + " Color: " + motorbike.getColor() + " Model: " + motorbike.getModel());
    }
}
