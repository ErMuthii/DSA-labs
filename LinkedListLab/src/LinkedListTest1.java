public class LinkedListTest1 {

    public static void main(String[] args){

        LinkedList2 lList = new LinkedList2();

        lList.addToHead("ICS 1011");
        lList.add("ICS 1201");
        lList.add("ICS 2024");
        lList.add("ICS 2102");
        lList.add("ICS 2105");
        lList.add("ICS 2013");

        System.out.println("Traversing the list");
        lList.traverse();
    }
    
}
