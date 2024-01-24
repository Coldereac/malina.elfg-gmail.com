package main.day19.Battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Field field1;
    private Field field2;
    private Field battleField1;
    private Field battleField2;

    private List<Ship> ships;

    public static void start() {
        try {
            new Game().startGame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void startGame() throws IOException {
        field1 = new Field();
        field2 = new Field();
        battleField1 = new Field();
        battleField2 = new Field();
        ships = new ArrayList<>();
        System.out.println("Начало игры \"Морской бой\"");
        System.out.println("Игрок 1 должен ввести координты своих кораблей. Игрок 2 в это время должен отвернуться");
        System.out.println("Игрок 1 введите координаты своих кораблей в виде x1,y1;x2,y2;x3,y3;x4,y4");
        System.out.println("Введите координаты четырехпалубного корабля:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();

    }

    private boolean checkInput(String input, int size, Field field) {
        String[] temp = input.split(";");
        if (checkNumberOfCoordinates(temp, size)) {
            if (checkCoordinates(temp)) {
                if (checkIfInOneLine(temp)) {
                    if (checkIfOnFreeSpot(temp, field)) {
                        return checkIfNotInAreola(temp, ships);
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkIfInOneLine(String[] temp) {
        if (Integer.parseInt(temp[0].split(",")[1]) == Integer.parseInt(temp[1].split(",")[1])) {
            for (int i = 1; i < temp.length - 1; i++) {
                if (!(Math.abs(Integer.parseInt(temp[0].split(",")[0]) - Integer.parseInt(temp[1].split(",")[0])) == 1))
                    return true;
            }
        } else if (Integer.parseInt(temp[0].split(",")[0]) == Integer.parseInt(temp[1].split(",")[0]))
            for (int i = 1; i < temp.length - 1; i++) {
                if (!(Math.abs(Integer.parseInt(temp[0].split(",")[1]) - Integer.parseInt(temp[1].split(",")[1])) == 1))
                    return true;
            }
        return false;
    }

    private boolean checkCoordinates(String[] temp) {
        for (String s : temp) {
            int[] tempInt = {Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1])};
            if (!(tempInt[0] > 0 && tempInt[1] > 0 && tempInt[0] < 9 && tempInt[1] < 9)) return false;
        }
        return true;
    }

    private boolean checkNumberOfCoordinates(String[] temp, int size) {
        int count = 0;
        for (String x : temp) {
            if (x.split(",").length == 2) count++;
            else return false;
        }
        return count == size;
    }

    private boolean checkIfNotInAreola(String[] temp, List<Ship> ships) {
        for (String i : temp) {
            for (Ship j : ships) {
                if (j.getAreola().contains(new Coordinates(Integer.parseInt(i.split(",")[0]), (Integer.parseInt(i.split(",")[1]))))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkIfOnFreeSpot(String[] temp, Field field) {
        for (String s : temp) {
            int[] tempInt = {Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1])};
            if (field.getField()[tempInt[0]][tempInt[1]] == 1) return false;
        }
        return true;
    }
}
