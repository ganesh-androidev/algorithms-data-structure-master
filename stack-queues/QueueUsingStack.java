// Question - Implement Queue Using Stack 
// Author : ganesh.androidev
import java.util.Stack;

class QueueUsingStack {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    static void enQueue(int x) {
      System.out.println("****** ENTER Do enQueue ...******"); 
       // Move elements from stack1 to stack2
       while (!stack1.isEmpty()) {
           System.out.println("stack1 Copy to Stack2 --> Peer  "+ stack1.peek());
            stack2.push(stack1.pop());
       }

     System.out.println("stack1 before MAIN push  >> . "+ stack1.size());
      // Push element
       stack1.push(x);
       

       while (!stack2.isEmpty()) {
           System.out.println("stack2 Copy to Stack1 --> Peer  "+ stack2.peek());
            stack1.push(stack2.pop());
       }
     System.out.println("stack1 AFTER final pop  >> . "+ stack1.size());
      System.out.println("####### END [" + stack1.peek() + "] #######");
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
