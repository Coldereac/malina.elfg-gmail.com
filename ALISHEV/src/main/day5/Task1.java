package main.day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1990);
        car.setColor("Yellow");
        car.setModel("520UL");
        System.out.println("Year: " + car.getYear() + " Color: " + car.getColor() + " Model: " + car.getModel());
    }
}
