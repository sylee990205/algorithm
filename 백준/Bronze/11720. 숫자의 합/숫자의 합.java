import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        String[] str = new String[size];
        str = bufferedReader.readLine().split("");
        int sum = 0;
        for (String e :
                str) {
            sum += Integer.parseInt(e);
        }
        System.out.println(sum);
        
    }
}
