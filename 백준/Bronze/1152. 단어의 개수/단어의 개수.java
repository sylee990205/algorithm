import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        int count = 0;
        for (String s : strings
        ) {
            if (s.equals(""))
                continue;
            else
                count++;
        }
        System.out.println(count);

    }
}
