import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        reader.close();

        boolean answer = false;

        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[chars.length-(i+1)]) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }

        System.out.println(answer ? 1 : 0);


    }
}