package main.day12.task5;

public class MusicArtist {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MusicArtist() {
        this.name = "";
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " ||Age: " + this.age;
    }
}
