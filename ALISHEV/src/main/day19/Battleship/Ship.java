package main.day19.Battleship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ship {
    private List<Coordinates> position;
    private int size;
    private List<Coordinates> areola;

    private boolean horizontal;

    public Ship (String coordinates){
        position = new ArrayList<>();
        String[] temp = coordinates.split(";");
        size = temp.length;
        for (int i = 0; i < size; i++) {
            position.add(new Coordinates(Integer.parseInt(temp[i].split(",")[0]), Integer.parseInt((temp[i].split(",")[1]))));
        }
        horizontal = position.getFirst().getX() != position.get(1).getX();
        sortPosition();
        findAreola();
    }

    private void findAreola(){
        areola = new ArrayList<>();
        if (horizontal){
            areola.add(new Coordinates(position.getFirst().getX()-1, position.getFirst().getY()));
            areola.add(new Coordinates(position.getFirst().getX()-1, position.getFirst().getY()+1));
            areola.add(new Coordinates(position.getFirst().getX()-1, position.getFirst().getY()-1));
            areola.add(new Coordinates(position.getLast().getX()+1, position.getLast().getY()));
            areola.add(new Coordinates(position.getLast().getX()+1, position.getLast().getY()+1));
            areola.add(new Coordinates(position.getLast().getX()+1, position.getLast().getY()-1));
            for (Coordinates x: position){
                areola.add(new Coordinates(x.getX(), x.getY()+1));
                areola.add(new Coordinates(x.getX(), x.getY()-1));
            }
        }
        else {
            areola.add(new Coordinates(position.getFirst().getX(), position.getFirst().getY()+1));
            areola.add(new Coordinates(position.getFirst().getX()+1, position.getFirst().getY()+1));
            areola.add(new Coordinates(position.getFirst().getX()-1, position.getFirst().getY()+1));
            areola.add(new Coordinates(position.getLast().getX(), position.getLast().getY()-1));
            areola.add(new Coordinates(position.getLast().getX()+1, position.getLast().getY()-1));
            areola.add(new Coordinates(position.getLast().getX()-1, position.getLast().getY()-1));
            for (Coordinates x: position){
                areola.add(new Coordinates(x.getX()+1, x.getY()));
                areola.add(new Coordinates(x.getX()-1, x.getY()));
            }
        }
    }
    private void sortPosition(){
        Coordinates max = new Coordinates(0, 0), min = new Coordinates(10, 10);
        int indexMin = 0, indexMax = 0;
        if (horizontal){
            for (int i = 0; i < position.size(); i ++){
                if (min.getX() > position.get(i).getX()) {
                    min = position.get(i);
                    indexMin = i;
                }
            }
            Coordinates temp = position.get(indexMin);
            position.remove(indexMin);
            position.addFirst(temp);
            for (int i = 0; i < position.size(); i++) {
                if (max.getX() < position.get(i).getX()) {
                    max = position.get(i);
                    indexMax = i;
                }
            }
            temp = position.get(indexMax);
            position.remove(indexMax);
            position.addLast(temp);
        }
        else {
            for (int i = 0; i < position.size(); i ++){
                if (min.getY() > position.get(i).getY()) {
                    min = position.get(i);
                    indexMin = i;
                }
            }
            Coordinates temp = position.get(indexMin);
            position.remove(indexMin);
            position.addLast(temp);
            for (int i = 0; i < position.size(); i++) {
                if (max.getY() < position.get(i).getY()) {
                    max = position.get(i);
                    indexMax = i;
                }
            }
            temp = position.get(indexMax);
            position.remove(indexMax);
            position.addFirst(temp);
        }
    }

    public List<Coordinates> getAreola() {
        return areola;
    }
}
