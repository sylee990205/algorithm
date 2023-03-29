import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int max = -1000000;
        int min = 1000000;
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = scanner.nextInt();
            if(ints[i] > max)
                max = ints[i];
            if (ints[i] < min)
                min = ints[i];
        }
        System.out.println(min + " " + max);
        scanner.close();
    }
}
