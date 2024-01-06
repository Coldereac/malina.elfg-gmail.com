package cyclesPractice;

public class Task5 {
    public static void main(String[] args) {
        char letter = 'b';
        for (letter = 'b'; isaBoolean(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isaBoolean(char letter) {
        return letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u';
    }
}
