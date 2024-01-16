package main.day16;

import java.io.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        File file1 = new File("ALISHEV/src/main/resources/file1.txt");
        File file2 = new File("ALISHEV/src/main/resources/file2.txt");
        try {
            PrintWriter writer = new PrintWriter(file1);

            for (int i = 0; i < 1000; i++)
                writer.println(random.nextInt(100));
            writer.flush();

            BufferedReader reader = new BufferedReader(new FileReader(file1));
            writer = new PrintWriter(file2);
            for (int i = 0; i < 50; i++) {
                double temp = 0;
                for (int j = 0; j < 20; j++) {
                    temp += Double.parseDouble(reader.readLine());
                }
                writer.printf("%.3f\n", temp / 20);
            }
            writer.close();
            printResult(file2);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException ignored){}

    }

    public static void printResult(File file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            double temp = 0;
            for (int i = 0; i < 50; i++) {
                temp += Double.parseDouble(reader.readLine());
            }
            System.out.println((int) temp);
        }
        catch (IOException e){
            System.out.println("Some problems man");
        }
    }
}
