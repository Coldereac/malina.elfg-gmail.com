package guessGame;

import java.util.*;

public class GuessGame {
    List<Player> players;
    private int guessedNumber;
    private boolean continueRun;
    private boolean[] playerGuessed = new boolean[3];

    public GuessGame() {
        players = List.of(new Player("Ivan"), new Player("Maria"), new Player("Ben"));
    }

    private void generateNumber() {
        guessedNumber = (int) (Math.random() * 10);
        System.out.println("Guessed number: " + guessedNumber);
    }

    private void checkAnswers(){
        for (Player x : players) {
            if (x.getAnswer() == guessedNumber) {
                playerGuessed[x.getCode()] = true;
            }
            System.out.println(x);
        }
    }

    private int countWinners(){
        int k = 0;
        for (int i = 0; i < 3; i++)
            if (playerGuessed[i]) k++;
        return k;
    }

    private void outputWinners(int k){
        for (int i = 0; i < 3; i++)
            if (playerGuessed[i]){
                if (k >= 2) System.out.println("and");
                players.get(i).printVictory();
            }

    }

    public void run() {
        continueRun = true;
        while (continueRun) {
            setFalse();
            generateNumber();
            checkAnswers();
            int k = countWinners();
            if (k == 0) System.out.println("No one guessed right, so lets try again");
            else {
                outputWinners(k);
                askToQuit();
            }
        }
    }
    private void setFalse(){
        Arrays.fill(playerGuessed, false);
    }

    private void askToQuit(){
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
