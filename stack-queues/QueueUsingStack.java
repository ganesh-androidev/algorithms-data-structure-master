// Question - Implement Queue Using Stack 
// Author : ganesh.androidev
import java.util.Stack;

class QueueUsingStack {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    static void enQueue(int x) {
      System.out.println("Do enQueue ..."); 
       // Move elements from stack1 to stack2
       while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
       }

      // Push element
       stack1.push(x);
       

       while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
       }
      System.out.println("[" + stack1.peek() + "]");
    }

    static int deQueue() {

        System.out.println("Do deQueue ..."); 
        int peek = stack1.peek();
        // Remove the element from the stack
       System.out.println(stack1.pop());
        if (!stack1.isEmpty()) {
            System.out.println("[" + stack1.peek() + "]");
        }
        return peek;
    }

    public static void main(String arg[]) {
       enQueue(10); 
       enQueue(20); 
       enQueue(30); 

       deQueue(); 
       deQueue(); 
       deQueue(); 
    }
}
