package OOP.task1;

public class DateTest {
    private int seconds;
    private int minutes;
    private int hours;

    public DateTest(int seconds, int minutes, int hours) {
            this.seconds = seconds % 12;
            this.minutes = minutes % 60;
            this.hours = hours % 60;
    }

    public DateTest(int seconds) {
        this.hours = seconds / 3600 % 12;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = seconds % 60;
    }

    public int getInSeconds(){
        return  seconds + minutes * 60 + hours * 3600;
    }

    @Override
    public String toString() {
        return "DateTest{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }

    public DateTest sum(DateTest second){
        return new DateTest(this.getInSeconds() + second.getInSeconds());
    }
}
