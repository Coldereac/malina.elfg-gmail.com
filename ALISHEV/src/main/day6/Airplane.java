package main.day6;

class Airplane {
    private String producer;
    private int year;
    private float length;
    private float weight;
    private float fuel;

    public Airplane(String producer, int year, float length, float weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + this.producer + " год выпуска: " + this.year
                + " длина: " + this.length + " вес: " + this.weight + " количество топлива в баке: " + this.fuel);
    }

    public void fillUp(float fuel){
        this.fuel += fuel;
    }

    public float getFuel() {
        return fuel;
    }

    public float getLength() {
        return length;
    }

    public float getWeight() {
        return weight;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
