public class StackTest {

    public static void main(String[] args) {

        StackX marks = new StackX(10);

        marks.push(52);
        marks.push(65);
        marks.push(89);
        marks.push(56);
        marks.push(65);

        marks.push(32);
        marks.push(46);
        marks.push(73);
        marks.push(55);
        marks.push(49);
        marks.push(12);
        
        // marks.pop();
        // marks.pop();
        // marks.pop();
        // marks.pop();
        // marks.pop();

        // marks.pop();
        // marks.pop();
        // marks.pop();
        // marks.pop();
        // marks.pop();
        // marks.pop();
        // marks.pop();

     


        

       for( int i = 0; i<=marks.top; i++){
        System.out.println(marks.stackArray[i]);
        System.out.println(" ");
       }
       System.out.println(" ");
       System.out.println("The item on top of the stack is: " + marks.peek());
    }
    
}
