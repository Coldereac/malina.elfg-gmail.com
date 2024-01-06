package main.day1;

public class Task6 {
    public static void main(String[] args) {
        int k =(int)( Math.random() * 8 + 1);
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + i * k);
        }
    }
}
