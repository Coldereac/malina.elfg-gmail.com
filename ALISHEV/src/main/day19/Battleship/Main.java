package main.day19.Battleship;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //TODO
        // 2) процесс перестрелки
        long currentTime = System.nanoTime();
        /*Ship ship = new Ship("4,7;4,9;4,6;4,8");*/
        Game.start();
        System.out.println((double) (System.nanoTime() - currentTime) / 1_000_000_000);
    }
}
