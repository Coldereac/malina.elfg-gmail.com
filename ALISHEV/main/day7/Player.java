package main.day7;

import static java.lang.Math.random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static final int MAX_PLAYERS = 6;


    public int getStamina() {
        return stamina;
    }

    /*public void run(){
        if (this.stamina == 0) {
            countPlayers--;
            return;
        }
        else  stamina--;
    }*/

    public static void run(Player player) {
        if (player.stamina == 0) {
            countPlayers--;
            player = null;
        } else player.stamina--;
    }
    public Player(){
        if (Player.countPlayers < 6) {
            this.stamina = (int) (random() * 11 + 90);
            Player.countPlayers++;
        }
        else return;
    }

    public Player(int stamina){
        this.stamina = stamina;
        if (Player.countPlayers < 6)
            Player.countPlayers++;
    }

    public static void info(){
        if (Player.countPlayers == Player.MAX_PLAYERS){
            System.out.println("На поле нет свободных мест\nВсего " + Player.countPlayers);
        }
        else System.out.println("Команды неполные. На поле еще есть " + (Player.MAX_PLAYERS - Player.countPlayers) + " свободных мест\nВсего " + Player.countPlayers);
    }
}
