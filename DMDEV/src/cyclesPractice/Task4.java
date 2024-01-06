package cyclesPractice;

public class Task4 {
    public static void main(String[] args) {
        int number = 5;
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (!prime) {
            System.out.println("Число " + number + " не является простым");
        } else {
            System.out.println("Число " + number + " является простым");
        }
    }
}
