package main.day9;

public class Triangle extends Figure{
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1,
                    double length2,
                    double length3,
                    String color){
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double p = (this.length1 + this.length2 + this.length3) / 2;
        return Math.sqrt(p * (p-this.length1) * (p-this.length2) * (p-this.length3));
    }

    @Override
    public double perimeter() {
        return this.length1 + this.length2 + this.length3;
    }
}
