package guessGame;

import java.util.Random;

public class Player {
    private String name;
    private int answer;

    private final int code;
    public static int number = 0;

    public int getCode() {
        return code;
    }

    public Player(String name) {
        this.name = name;
        code = number;
        number++;
    }

    private int generateAnswer(){
        return  (int) (Math.random() * 10);
    }

    public int getAnswer() {
        answer = generateAnswer();
        return answer;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player " + name + "'s" +
                " answer is " + answer;
    }

    public void printVictory(){
        System.out.println("Player " + name + " win");
    }
}
