package recursion;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        long currentTime = System.nanoTime();
        int[] primeNumbers = new int[10];
        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = Methods.simpleNumber(number, primeNumbers, i);
            }
        }
        System.out.println(Arrays.toString(primeNumbers));
        System.out.println(Methods.sumr(primeNumbers));
        System.out.println("Time: " + (System.nanoTime() - currentTime));
    }
}
