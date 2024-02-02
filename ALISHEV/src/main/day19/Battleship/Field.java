package main.day19.Battleship;

import java.util.ArrayList;
import java.util.List;

/*
0 - ничего
1 - есть корабль
2 - мимо
-1 уничтоженный / подбитый корабль
 */
public class Field {
    private final int[][] field = new int[10][10];
    private final List<Ship> ships;
    public void print(){
        System.out.println("    1  2  3  4  5  6  7  8  9  10");
        for (int i = 0; i < field.length; i++) {
            System.out.printf("%-2d", i+1);
            for (int j = 0; j < field[i].length; j++) {
                switch (field[i][j]){
                    case -1 -> System.out.printf("%3s", "X");
                    case 0 -> System.out.printf("%3s", "0");
                    case 1 -> System.out.printf("%3s", "К");
                    case 2 -> System.out.printf("%3s", "*");
                }
            }
            System.out.println();
        }
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int x, int y, int value) {
        field[x][y] = value;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public Field(){
        this.ships = new ArrayList<>();
    }

    public Ship findShip(int x, int y){
        for (Ship s: ships){
            for (Coordinates c: s.getPosition()){
                if (new Coordinates(x, y).equals(c))
                    return s;
            }
        }
        return null;
    }

    public void markAreola(List<Coordinates> areola){
        for (Coordinates cord: areola){
            field[cord.getY()][cord.getX()] = -1;
        }
    }
}
