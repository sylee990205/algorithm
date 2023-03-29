import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a, count = 0;
        int[] b = new int[42];
        for (int i = 0; i < 10; i++) {
            a = Integer.parseInt(bufferedReader.readLine());
            b[a % 42] = 1;
        }
        for (int e : b) {
            if (e == 1)
                count++;
        }
        System.out.println(count);
    }
}
