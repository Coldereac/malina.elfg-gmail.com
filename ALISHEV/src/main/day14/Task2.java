package main.day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("ALISHEV/src/main/day14/people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
            List<String> result = new ArrayList<>();
            String line = bf.readLine();
            while (line != null){
                if (Integer.parseInt(line.split(" ")[1]) < 0){
                    throw new IllegalArgumentException();
                }
                result.add(line);
                line = bf.readLine();
            }
            return result;
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        catch (IOException ignored){
        }

        catch (IllegalArgumentException e){
            System.out.println("Incorrect input file");
        }

        return null;
    }
}
