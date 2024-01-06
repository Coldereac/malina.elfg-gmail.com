package main.day7;

/**
 *
 */
public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(100);
        Player player2 = new Player();
        Player player3 = new Player();

        Player.info();

        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        Player.info();

        Player player7 = new Player();

        Player.info();

        for (int i = 0; i < 101; i++) {
            Player.run(player1);
        }

        Player.info();
    }
}
