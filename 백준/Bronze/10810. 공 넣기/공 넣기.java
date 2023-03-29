import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt() + 1;
        int inputTime = scanner.nextInt();
        int[] ball = new int[size];
        int start, end, num;
        for (int i = 0; i < inputTime; i++) {
            start = scanner.nextInt();
            end = scanner.nextInt();
            num = scanner.nextInt();

            for (int j = start; j <= end; j++){
                ball[j] = num;
            }
        }

        for (int i = 1 ; i < ball.length; i++) {
            System.out.print(ball[i] + " ");
        }
        
        scanner.close();
    }
}
