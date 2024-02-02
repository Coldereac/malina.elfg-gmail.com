package main.day19.Battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Game {
    Field field1;
    Field field2;
    Field battleField1;
    Field battleField2;

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
        boolean playing = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Начало игры \"Морской бой\"");
        System.out.println("Игрок 1 должен ввести координты своих кораблей. Игрок 2 должен отвернуться от экрана");
        System.out.println("Игрок 1 введите координаты своих кораблей в виде x1,y1;x2,y2;x3,y3;x4,y4");
        for (int i = 4; i >= 1; i--) { // создание кораблей для игрока 1
            for (int j = 5 - i; j >= 1; j--) {
                createShip(i, field1, reader);
            }
        }

        for (int i = 0; i < 50; i ++){
            System.out.println("");
        }

        System.out.println("Игрок 2 должен ввести координты своих кораблей. Игрок 1 должен отвернуться от экрана");
        System.out.println("Игрок 2 введите координаты своих кораблей в виде x1,y1;x2,y2;x3,y3;x4,y4");
        for (int i = 4; i >= 1; i--) { // создание кораблей для игрока 2
            for (int j = 5 - i; j >= 1; j--) {
                createShip(i, field2, reader);
            }
        }

        while (playing) {
            if (field1.getShips().isEmpty()){
                System.out.println("Player 2 win");
                playing = false;
            }
            else if (field2.getShips().isEmpty()){
                System.out.println("Player 1 win");
                playing = false;
            }
            playerMove(field2, battleField1, reader); //first player move
            playerMove(field1, battleField2, reader); //second player move
        }

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
        for (String i : temp.split(";")) {
            field.setField(Integer.parseInt(i.split(",")[1]) - 1, Integer.parseInt(i.split(",")[0]) - 1, 1);
        }
    }

    private boolean checkInput(String input, int size, Field field) { //TODO: переделать структуру if
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
        int x = Integer.parseInt(temp[0].split(",")[0]);
        int y = Integer.parseInt(temp[0].split(",")[1]);

        boolean isHorizontal = true;
        boolean isVertical = true;

        //If both the x and y values change for any coordinate, it returns false, as this means the coordinates are not in a straight line.
        for (int i = 1; i < temp.length; i++) {
            String[] coordinates = temp[i].split(",");
            int newX = Integer.parseInt(coordinates[0]);
            int newY = Integer.parseInt(coordinates[1]);

            if (newX != x) {
                isHorizontal = false;
            }

            if (newY != y) {
                isVertical = false;
            }

            if (!isHorizontal && !isVertical) {
                return false;
            }
        }

        return true;
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
                for (Coordinates x : j.getAreola()) {
                    if (x.getX() == Integer.parseInt(i.split(",")[0]) - 1 && x.getY() == Integer.parseInt(i.split(",")[1]) - 1)
                        return false;
                }
            }
        }
        return true;
    }

    private boolean checkIfOnFreeSpot(String[] temp, Field field) {
        for (String s : temp) {
            int[] tempInt = {Integer.parseInt(s.split(",")[0]) - 1, Integer.parseInt(s.split(",")[1]) - 1};
            if (field.getField()[tempInt[1]][tempInt[0]] == 1) return false;
        }
        return true;
    }

    private void playerMove(Field opponentField, Field battleField, BufferedReader reader) throws IOException {
        boolean hitting = true;
        while (hitting) {
            System.out.println("Enter coordinates (x,y), where you want to shoot");
            String temp = reader.readLine();
            while (!checkAttackCoordinates(temp)) {
                System.out.println("Wrong input");
                temp = reader.readLine();
            }
            int x, y;
            x = Integer.parseInt(temp.split(",")[0]);
            y = Integer.parseInt(temp.split(",")[1]);
            switch (opponentField.getField()[x][y]) {
                case 1 -> {
                    battleField.setField(x, y, -1);
                    Ship ship = opponentField.findShip(x, y);
                    ship.addHit();
                    if (ship.checkIfDestroyed()) {
                        opponentField.getShips().remove(ship);
                        battleField.markAreola(ship.getAreola());
                    }
                }
                case 0 -> {
                    battleField1.setField(x, y, 2);
                    hitting = false;
                }
                case 2, -1 -> System.out.println("You already checked this tile");
            }
        }
    }

    private boolean checkAttackCoordinates(String temp) {
        int[] tempInt = {Integer.parseInt(temp.split(",")[0]), Integer.parseInt(temp.split(",")[1])};
        return tempInt[0] > 0 && tempInt[1] > 0 && tempInt[0] < 11 && tempInt[1] < 11;
    }
}
