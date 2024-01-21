package main.day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7((22222)));
    }

    public static int count7(int number){
        if (number == 0){
            return 0;
        }
        return ((number % 10 == 7)? 1 : 0) + count7(number / 10);
    }
}
