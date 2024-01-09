package main.day12.task5;

import java.util.List;

class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> members;

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public MusicBand(int year, String name, List<MusicArtist> members){
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
        for (MusicArtist x: a.getMembers()){
            b.getMembers().add(x);
        }
        a.getMembers().clear();
    }

    protected void printMembers(){
        System.out.println(this.members);
    }
}
