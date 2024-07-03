package RecursionLabs.src;
import java.util.Scanner;

public class printNumbers {
    public static void main(String[] args) {
        //Used scanner to input values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = scanner.nextInt();
        System.out.println("Enter the end number:");
        int end = scanner.nextInt();
        recprintNumbers(start, end);
        scanner.close();
    }

    public static void recprintNumbers(int start, int end) {
        // base case
        if (start > end) {
            return;
        } else {
            System.out.println(start);
            // recursive call
            recprintNumbers(start + 1, end);
        }
    }
}