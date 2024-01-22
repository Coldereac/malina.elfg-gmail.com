package main.day19.Battleship;

import java.util.List;

public class Ship {
    private Coordinates[] position;
    private int size;

    public Ship (String coordinates){
        String[] temp = coordinates.split(";");
        size = temp.length;
        for (int i = 0; i < size; i++) {
            position[i] = new Coordinates(Integer.parseInt(temp[i].split(",")[0]), Integer.parseInt((temp[i].split(",")[1])));
        }
    }
}
