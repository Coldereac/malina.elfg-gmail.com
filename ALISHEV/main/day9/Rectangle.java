package main.day9;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.length);
    }
}
