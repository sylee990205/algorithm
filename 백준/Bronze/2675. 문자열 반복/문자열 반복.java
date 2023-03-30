import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        String[] str;
        for (int i = 0; i < testCase; i++) {
            str = bufferedReader.readLine().split(" ");
            String[] word = str[1].split("");
            for (int j = 0; j < word.length; j++) {
                for (int k = 0; k < Integer.parseInt(str[0]); k++) {
                    System.out.print(word[j]);
                }
            }
            System.out.println();
        }
    }
}
