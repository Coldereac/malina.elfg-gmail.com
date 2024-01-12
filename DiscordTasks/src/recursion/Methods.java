package recursion;

public class Methods {
    public static void concatination(StringBuilder result, String input){
        result.append(input).append(" ");
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static double sum (double a, double b){
        return a + b;
    }

    public static long sum (long a,long b){
        return a + b;
    }

    public static short sum (short a, short b){
        return (short) (a + b);
    }

    public static byte sum (byte a, byte b){
        return (byte) (a + b);
    }

    public static String sum (char a, char b){
        return String.valueOf(a) + b;
    }

    public static boolean sum (boolean a, boolean b){
        return a && b;
    }

    public static long factorial(long a){
        if (a == 1){
            return 1;
        }
        return a * factorial(a-1);
    }

    public static double recursion(double n, int m){
        if (n == m) {
            return Math.sqrt(m);
        }
        return Math.sqrt(m + recursion(n, m+1));
    }

    public static int simpleNumber(int number, int[] numbers, int currentIndex){
        if(isPrime(number, numbers, currentIndex)){
            return number;
        }
        return simpleNumber(number+2, numbers, currentIndex);
    }

    private static boolean isPrime(int number, int [] numbers, int currentIndex){
        boolean prime = true;
        /*int i = 0;*/
        for (int i = 0; i < currentIndex && prime; i++) {
            if (number / numbers[i] > 1)
                break;
            if (number % numbers[i] == 0)
                prime = false;
        }
        /*while (prime && i < currentIndex && number / numbers[i] > 1){
            if (number % numbers[i] == 0) prime = false;
            else i++;
        }*/
        return prime;
    }

    public static int sumr(int [] numbers) {
        return sumr(numbers, 0);
    }

    private static int sumr(int[] numbers, int i){
        if (numbers.length-1 == i){
            return numbers[i];
        }
        return numbers[i] + sumr(numbers, i + 1);
    }
}
