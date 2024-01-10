package somePractice;

public class Task3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int max = getMax(10, 20);
    }

    public static int getMax(int i, int j){
        if(i > j)
            return i;
        else return j;
    }
}
