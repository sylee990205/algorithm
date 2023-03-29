import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] nums = new int[size];
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
            nums[i] = scanner.nextInt();
        }
        int find = scanner.nextInt();

        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] == find) {
                count++;
            }
        }
        System.out.println(count);
    }
}