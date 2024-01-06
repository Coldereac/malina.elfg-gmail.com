package main.day9;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Area: " + calculateRedArea(figures) + "\nPerimeter: " + calculateRedPerimeter(figures));
    }

    public static double calculateRedArea(Figure[] figures){
        double area = 0;
        for(Figure figure: figures){
            if(figure.getColor().equals("Red")) area += figure.area();
        }
        return area;
    }

    public static double calculateRedPerimeter(Figure[] figures){
        double perimeter = 0;
        for(Figure figure: figures){
            if(figure.getColor().equals("Red")) perimeter += figure.perimeter();
        }
        return perimeter;
    }
}
