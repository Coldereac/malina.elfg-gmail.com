package main.day5;

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(){
        this.year = 0;
        this.color = "None";
        this.model = "None";
    }

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
