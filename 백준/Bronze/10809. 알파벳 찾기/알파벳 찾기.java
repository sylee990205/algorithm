import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        word = word.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(word.indexOf(c) + " ");
        }
    }
}
