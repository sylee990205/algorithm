import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] student = new int[31];
        int check;
        String str;
        for (int i = 0; i < 28; i++) {
            str = bufferedReader.readLine();
            check = Integer.parseInt(str);
            student[check] = 1;
        }

        for (int i = 1; i <= student.length - 1; i++) {
            if(student[i] != 1)
                System.out.println(i);
        }
    }
}
