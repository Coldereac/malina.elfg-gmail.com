package cyclesPractice;
public class Task1 {
    public static void main(String[] args) {
        int number = 20;
        long result = 1l;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}