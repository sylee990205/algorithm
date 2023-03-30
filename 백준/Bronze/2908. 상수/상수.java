import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String[] numA = Integer.toString(a).split("");
        String[] numB = Integer.toString(b).split("");

        a = Integer.parseInt(numA[0]) + Integer.parseInt(numA[1]) * 10 + Integer.parseInt(numA[2]) * 100;
        b = Integer.parseInt(numB[0]) + Integer.parseInt(numB[1]) * 10 + Integer.parseInt(numB[2]) * 100;

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}