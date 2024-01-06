package main.day9;

public abstract class Human{
    private String name;

    public void printInfo(){
        System.out.println("Этот человек с именем " + this.name);
    }

    public Human(){
        this.name = "";
    }

    public Human(String name){
        this.name = name;
    }

    public void setName(String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

