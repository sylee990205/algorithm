import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        double[] score = new double[test];
        double max = 0;
        double sum = 0;
        double avg;
        for (int i = 0; i < test; i++) {
            score[i] = scanner.nextDouble();
            if (score[i] > max)
                max = score[i];
        }

        for (int i = 0; i < test; i++) {
            sum = (score[i] / max * 100) + sum;
        }
        avg = sum / (double) test;
        System.out.println(avg);
        scanner.close();
    }
}