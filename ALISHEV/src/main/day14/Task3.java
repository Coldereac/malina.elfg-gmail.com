package main.day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("ALISHEV/src/main/day14/people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Human> parseFileToObjList(File file){
        try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
            List<Human> result = new ArrayList<>();

            String line = bf.readLine();
            while (line != null){
                if (Integer.parseInt(line.split(" ")[1]) < 0) throw new IllegalArgumentException();
                result.add(new Human(line.split(" ")[0], Integer.parseInt(line.split(" ")[1])));
                line = bf.readLine();
            }

            return result;
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        catch (IOException ignored){}

        catch (IllegalArgumentException e){
            System.out.println("Incorrect input file");
        }
        return null;
    }
}
