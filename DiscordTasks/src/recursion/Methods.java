package recursion;

public class Methods {
    public static String concatination(String ...strings){
        if (strings.length == 0){
            return "";
        }
        String result = "";
        for (String x: strings)
            result += x + " ";
        return result.trim();
    }

    public static int sum(int ...numbers){
        int sum = 0;
        for (int x: numbers)
            sum += x;
        return sum;
    }

    public static float sum(float ...numbers){
        float sum = 0;
        for (float x: numbers)
            sum += x;
        return sum;
    }

    public static double sum (double ...numbers){
        double sum = 0;
        for (double x: numbers)
            sum += x;
        return sum;
    }

    public static long sum (long ...numbers){
        long sum = 0;
        for (long x: numbers)
            sum += x;
        return sum;
    }

    public static short sum (short ...numbers){
        short sum = 0;
        for (short x: numbers)
            sum += x;
        return sum;
    }

    public static byte sum (byte ...numbers){
        byte sum = 0;
        for (byte x: numbers)
            sum += x;
        return sum;
    }

    public static String sum (char ...chars){
        String result = "";
        for (char x: chars)
            result += x;
        return result;
    }

    public static boolean sum (boolean ...booleans){
        boolean result = true;
        for (boolean x: booleans)
            result = result && x;
        return result;
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
