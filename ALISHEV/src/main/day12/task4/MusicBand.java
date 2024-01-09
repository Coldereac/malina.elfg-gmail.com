package main.day12.task4;

import java.util.ArrayList;
import java.util.List;

class MusicBand {
    private int year;
    private String name;
    private List<String> members;

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public MusicBand(int year, String name, List<String> members){
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Year: " + this.year + " ||Name: " + this.name + " ||Members: " + this.members;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (String x: a.getMembers()){
            b.getMembers().add(x);
        }
        a.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    }
}
