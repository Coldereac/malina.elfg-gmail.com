package main.day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
    }

    public static int recursionSum(int[] array){
       return recursionSumCalculation(array, array.length-1);
    }
    static int recursionSumCalculation(int[] array, int k){
        if (k == 0){
            return array[0];
        }
        return array[k] + recursionSumCalculation(array, k-1);
    }
}
