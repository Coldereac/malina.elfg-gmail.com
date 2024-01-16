package main.day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        double result = avg(new File("ALISHEV/src/main/resources/numbers.txt"));
        System.out.printf("%f --> %.3f", result, result);
    }

    public static double avg(File file) {
        double result = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            List<String > temp = new ArrayList<>();
            while (line != null){
                temp.addAll(List.of(line.split(" ")));
                line = reader.readLine();
            }
            for (String x: temp){
                result += Double.parseDouble(x);
            }
            result /= temp.size();
        }
        catch (IOException e){
            System.out.println("File not found");
        }
        return result;
    }
}
