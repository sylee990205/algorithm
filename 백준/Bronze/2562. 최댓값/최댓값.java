import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int[] ints = new int[9];
        int max = 0, index = 0;
        
        for (int i = 0; i < ints.length; i++) {
            str = bufferedReader.readLine();
            ints[i] = Integer.parseInt(str);
            if (ints[i] > max){
                max = ints[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
