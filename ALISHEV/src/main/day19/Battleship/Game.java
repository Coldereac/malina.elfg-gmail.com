package main.day19.Battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private Field field1;
    private Field field2;
    private Field battleField1;
    private Field battleField2;


    public void startGame() throws IOException {
        field1 = new Field();
        field2 = new Field();
        battleField1 = new Field();
        battleField2 = new Field();
        System.out.println("Начало игры \"Морской бой\"");
        System.out.println("Игрок 1 должен ввести координты своих кораблей. Игрок 2 в это время должен отвернуться");
        System.out.println("Игрок 1 введите координаты своих кораблей в виде x1,y1;x2,y2;x3,y3;x4,y4");
        System.out.println("Введите координаты четырехпалубного корабля:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
    }

    private boolean checkInput(String input, int size, Field field) {
        String[] temp = input.split(";");
        int count = 0;
        int[] tempInt;
        boolean horizontal;
        for (String s : temp) {
            tempInt = new int[]{Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1])};
            if (!(tempInt[0] > 0 && tempInt[1] > 0 && tempInt[0] < 9 && tempInt[1] < 9)) return false;
            if (field.getField()[tempInt[0]][tempInt[1]] == 1) return false;
            count++;
        }
        if (count != size) return false;
        if (Math.abs(Integer.parseInt(temp[0].split(",")[0]) - Integer.parseInt(temp[1].split(",")[0])) == 1) horizontal = true;
        else if (Math.abs(Integer.parseInt(temp[0].split(",")[1]) - Integer.parseInt(temp[1].split(",")[1])) == 1) horizontal = false;
        else return false;
        if (horizontal){
            for (int i = 1; i < temp.length-1; i++) {
                if (!(Math.abs(Integer.parseInt(temp[0].split(",")[0]) - Integer.parseInt(temp[1].split(",")[0])) == 1)) return false;
            }
        }
        else for (int i = 1; i < temp.length-1; i++) {
            if (!(Math.abs(Integer.parseInt(temp[0].split(",")[1]) - Integer.parseInt(temp[1].split(",")[1])) == 1)) return false;
        }

    }
}
