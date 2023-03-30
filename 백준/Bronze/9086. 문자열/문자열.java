import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        String str;
        for (int i = 0; i < testCase; i++) {
            str = bufferedReader.readLine();

            System.out.printf("%c%c\n",str.charAt(0),str.charAt(str.length()-1));
        }
    }
}