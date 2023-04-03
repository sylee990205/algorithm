import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] chess = {1, 1, 2, 2, 2, 8};

        Scanner scanner = new Scanner(System.in);
        int[] find = new int[6];
        for (int i = 0; i < find.length; i++) {
            find[i] = scanner.nextInt();
            System.out.print(chess[i] - find[i]);
            System.out.print(" ");
        }
        scanner.close();
    }
}
