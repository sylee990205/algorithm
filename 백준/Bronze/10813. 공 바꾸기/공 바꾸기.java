import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt() + 1;
        int[] basket = new int[size];
        int repeat = scanner.nextInt();
        int ball1, ball2, temp;

        for (int i = 1; i < size; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < repeat; i++) {
            ball1 = scanner.nextInt();
            ball2 = scanner.nextInt();

            temp = basket[ball1];
            basket[ball1] = basket[ball2];
            basket[ball2] = temp;
        }

        for (int i = 1; i < size; i++) {
            System.out.print(basket[i] + " ");
        }
        scanner.close();
    }
}
