package cyclesPractice;

public class Task2 {
    public static void main(String[] args) {
        int number = 378572893;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
