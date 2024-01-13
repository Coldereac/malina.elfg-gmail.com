package guessGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    List<Player> players = new ArrayList<>();
    private int guessedNumber;
    private boolean continueRun;
    private boolean[] playerGuessed = new boolean[3];

    public GuessGame() {
        players = List.of(new Player("Ivan"), new Player("Maria"), new Player("Ben"));
    }

    private int generateNumber() {
        return (int) (Math.random() * 10);
    }

    public void run() {
        continueRun = true;
        while (continueRun) {
            for (int i = 0; i < 3; i++) {
                playerGuessed[i] = false;
            }
            guessedNumber = generateNumber();
            System.out.println("Guessed number: " + guessedNumber);

            for (Player x : players) {
                if (x.getAnswer() == guessedNumber) {
                    playerGuessed[x.getCode()] = true;
                }
                System.out.println(x);
            }
            int k = 0;
            for (int i = 0; i < 3; i++) {
                if (playerGuessed[i]) {
                    k++;
                    if (k >= 2) {
                        System.out.println("and");
                    }
                    System.out.println(players.get(i).printVictory());
                }
            }
            if (k == 0) System.out.println("No one guessed right, so lets try again");
            else {
                System.out.println("If you want to quit type q. If no type n");
                Scanner scanner = new Scanner(System.in);
                String temp = scanner.next();
                while (!temp.equals("q") && !temp.equals("n")) {
                    System.out.println("Wrong input");
                    temp = scanner.next();
                }
                if (temp.equals("q")) continueRun = false;
            }
        }
    }

}
