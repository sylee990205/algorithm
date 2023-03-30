import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int repeat = scanner.nextInt();
        int[] basket = new int[size];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }

        int num1, num2, temp;
        for (int i = 0; i < repeat; i++) {
            num1 = scanner.nextInt() - 1;
            num2 = scanner.nextInt() - 1;
            while (num1 <= num2) {
                temp = basket[num1];
                basket[num1] = basket[num2];
                basket[num2] = temp;
                num1++;
                num2--;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}