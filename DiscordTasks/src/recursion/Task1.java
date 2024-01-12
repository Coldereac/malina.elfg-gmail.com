package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("Type Strings. If you want to stop - type space and nothing else");
        input = reader.readLine();
        while (!input.isEmpty()){
            Methods.concatination(result, input);
            input = reader.readLine();
        }
        System.out.println(result.toString().trim());
    }
}
