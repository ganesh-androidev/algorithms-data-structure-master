/** 
 Demonstrate Queue Peek, enqueue , dequeue Search Method using Arrays
 Author : @ganesh.androidev
**/

import java.util.ArrayList;

class QueueArray {
    static ArrayList<String> qArray = new ArrayList<String>();
    
    static void enqueue(String value) {
         qArray.add(value);
    }
   
   static void doPeek() {
        int size = qArray.size() - 1;
        int index = 0;
        System.out.println("Fetch Stack in Queue");
        while (size >=  0) {
            System.out.println( "[" + qArray.get(index++) + " ]");
            size--;
        }

   }

    static void dequeue() {
        qArray.remove(0);
    }


   public static void main(String arg[]) {
       enqueue("Joy");
       enqueue("Matt");
       enqueue("Pavel");
       enqueue("Samir");
       doPeek();
       dequeue();
       doPeek();
       enqueue("Ram");
       enqueue("Sam");
       doPeek();
       dequeue();
       doPeek();
    }
}
