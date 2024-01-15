package main.day15;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File input = new File("ALISHEV/src/main/resources/shoes.csv");
        File output = new File("ALISHEV/src/main/resources/missing_shoes.txt");
        PrintWriter  writer = new PrintWriter(output);
        BufferedReader reader = new BufferedReader(new FileReader(input));

        String line = reader.readLine();
        while (line != null){
            if (line.split(";")[2].equals("0")){
                writer.println(line);
            }
            line = reader.readLine();
        }

        writer.close();
        reader.close();
    }
}
