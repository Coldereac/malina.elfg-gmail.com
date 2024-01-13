package main.day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("ALISHEV/src/main/day14/numbers.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            List<String> list = new ArrayList<>(List.of(bf.readLine().split(" ")));
            if (list.size() != 10) throw new IllegalArgumentException();
            else {
                int sum = 0;
                for (String x : list) {
                    sum += Integer.parseInt(x);
                }
                System.out.printf("Sum = %d", sum);
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        catch (IOException ignored) {}

        catch (IllegalArgumentException e){
            System.out.println("Incorrect input file");
        }

    }
}