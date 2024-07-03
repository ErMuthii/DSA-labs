package RecursionLabs.src;

public class printArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        recprintArray(arr, 0);
    }

    public static void recprintArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        } else {
            System.out.println(arr[index]);
            recprintArray(arr, index + 1);
        }
    }
    
}
