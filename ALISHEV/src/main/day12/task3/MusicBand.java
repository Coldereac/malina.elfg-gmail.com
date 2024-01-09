package main.day12.task3;

class MusicBand {
    private int year;
    private String name;

    public MusicBand(int year, String name){
        this.year = year;
        this.name = name;
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
        return "Year: " + this.year + " ||Name: " + this.name;
    }
}
