package RecursionLabs.src;
import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        int sum = recsumNumbers(n);
        System.out.println("The sum is: " + sum);
        scanner.close();
    }

    public static int recsumNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + recsumNumbers(n - 1);
        }
    }
}