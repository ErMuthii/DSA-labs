public class QueueTest {
    public static void main(String[] args) {
        Queue line = new Queue(10);

        for(int i=1; i<=10;i++){
            line.insert(i);
        }

        // Print out the elements at front and rear
        System.out.println("Element at front: " + line.peekFront());
        System.out.println("Element at rear: " + line.queArray[line.rear]);

        // Print out the indexes of front and rear
        System.out.println("Index of front: " + line.front);
        System.out.println("Index of rear: " + line.rear);
    }
}
