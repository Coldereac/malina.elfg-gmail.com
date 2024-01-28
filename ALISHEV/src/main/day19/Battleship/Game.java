package main.day19.Battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Game {


    public static void start() {
        try {
            new Game().startGame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void startGame() throws IOException {
        Field field1 = new Field();
        Field field2 = new Field();
        Field battleField1 = new Field();
        Field battleField2 = new Field();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Начало игры \"Морской бой\"");
        System.out.println("Игрок 1 должен ввести координты своих кораблей. Игрок 2 должен отвернуться от экрана");
        System.out.println("Игрок 1 введите координаты своих кораблей в виде x1,y1;x2,y2;x3,y3;x4,y4");
        field1.print();

        for (int i = 4; i >= 1; i--) { // создание кораблей для игрока 1
            for (int j = 5 - i; j >= 1; j--) {
                createShip(i, field1, reader);
            }
        }

        System.out.print("\033[H\033[J");
        System.out.println("Игрок 2 должен ввести координты своих кораблей. Игрок 1 должен отвернуться от экрана");
        System.out.println("Игрок 2 введите координаты своих кораблей в виде x1,y1;x2,y2;x3,y3;x4,y4");
        field2.print();
        for (int i = 4; i >= 1; i--) { // создание кораблей для игрока 2
            for (int j = 5 - i; j >= 1; j--) {
                createShip(i, field2, reader);
            }
        }

        System.out.println(field1.getShips() + "\n" + field2.getShips());
        reader.close();
    }

    private void createShip(int size, Field field, BufferedReader reader) throws IOException {
        switch (size) {
            case 4 -> System.out.println("Введите координаты четырехпалубного корабля:");
            case 3 -> System.out.println("Введите координаты трехпалубного корабля:");
            case 2 -> System.out.println("Введите координаты двухпалубного корабля:");
            case 1 -> System.out.println("Введите координаты однопалубного корабля:");
        }
        create(size, field, reader);
        field.print();
    }

    private void create(int size, Field field, BufferedReader reader) throws IOException {
        String temp = reader.readLine();
        while (!checkInput(temp, size, field)) {
            System.out.println("Wrong input");
            temp = reader.readLine();
        }
        field.getShips().add(new Ship(temp));
        for (String i: temp.split(";")){
            field.setField(Integer.parseInt(i.split(",")[1])-1, Integer.parseInt(i.split(",")[0])-1, 1);
        }
    }

    private boolean checkInput(String input, int size, Field field) {
        String[] temp = input.split(";");
        if (checkNumberOfCoordinates(temp, size)) if (checkCoordinates(temp)) {
            if (temp.length > 1) {
                if (checkIfInOneLine(temp)) if (checkIfOnFreeSpot(temp, field))
                    return checkIfNotInAreola(temp, field.getShips());
            } else if (checkIfOnFreeSpot(temp, field)) return checkIfNotInAreola(temp, field.getShips());
        }
        return false;
    }

    private static boolean checkIfInOneLine(String[] temp) {
        if (Integer.parseInt(temp[0].split(",")[1]) == Integer.parseInt(temp[1].split(",")[1])) {
            for (int i = 1; i <= temp.length - 1; i++) {
                if ((Math.abs(Integer.parseInt(temp[0].split(",")[0]) - Integer.parseInt(temp[1].split(",")[0])) == 1))
                    return true;
            }
        } else if (Integer.parseInt(temp[0].split(",")[0]) == Integer.parseInt(temp[1].split(",")[0]))
            for (int i = 1; i <= temp.length - 1; i++) {
                if ((Math.abs(Integer.parseInt(temp[0].split(",")[1]) - Integer.parseInt(temp[1].split(",")[1])) == 1))
                    return true;
            }
        return false;
    }

    private boolean checkCoordinates(String[] temp) {
        for (String s : temp) {
            int[] tempInt = {Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1])};
            if (!(tempInt[0] > 0 && tempInt[1] > 0 && tempInt[0] < 11 && tempInt[1] < 11)) return false;
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
                for (Coordinates x: j.getAreola()){
                    if (x.getX() == Integer.parseInt(i.split(",")[0])-1 && x.getY() == Integer.parseInt(i.split(",")[1])-1)
                        return false;
                }
            }
        }
        return true;
    }

    private boolean checkIfOnFreeSpot(String[] temp, Field field) {
        for (String s : temp) {
            int[] tempInt = {Integer.parseInt(s.split(",")[0])-1, Integer.parseInt(s.split(",")[1])-1};
            if (field.getField()[tempInt[0]][tempInt[1]] == 1) return false;
        }
        return true;
    }
}
