package main.day8;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        /*String string1 = "";
        for (int i = 0; i < 20001; i++) {
            string1 += i + " ";
        }

        System.out.println(string1);*/

        StringBuilder stringBuilder = new StringBuilder();
        //Вносим изменение в код
        System.out.println("Hello world");
        for (int i = 0; i < 20001; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
        System.out.println("Work time: " + (System.currentTimeMillis() - startTime));

    }
}
