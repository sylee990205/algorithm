import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);

        int i = c;
        System.out.println(i);
        scanner.close();
    }
}