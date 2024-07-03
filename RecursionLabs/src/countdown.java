package RecursionLabs.src;

public class countdown {
    public static void main(String[] args) {
        reccountdown(10);
    }

    public static void reccountdown(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        } else if (n > 0) {
            System.out.println(n);
            reccountdown(n - 1);
        }
    }
}