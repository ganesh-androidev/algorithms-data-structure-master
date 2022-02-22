/** 
Last in First Out.
Write a program to demonstrate the Stack class 
which expline push, pop, peek, search 
**/

import java.io.*;
import java.util.*;

class StackExample {

    // Push / Add the elements to the stack
    static void doPush(Stack<Integer>  stack) {
        System.out.println("Do Stack Push Operation");
        for (int i = 1; i< 10; i++) {
            stack.push( i * 10); //  i is value here
            doPeek(stack);
        }
    }

   // Pop / Remove the elements from Top Stack / Recently added 
    static void doPop(Stack<Integer> stack) {
        System.out.println("Do Stack Pop Operation");
        for (int i =0; i< 3; i++) {
            Integer popElement = (Integer) stack.pop();
            System.out.println(popElement);
        }
    }
    
    // Peek / Display the Current Top element in the stack
    static Integer doPeek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("D Peek Operation : Result, Element on the Top is : " + element);
        return element;
    }

   // Seach element in the stack based on element
   static void doSearch(Stack<Integer> stack, int element) {
        Integer position = (Integer) stack.search(element);
       
       if (position < 0) {
            System.out.println("Search Element on Stack - Not Found");
       } else {
            System.out.println("Search Element on Stack - Found on Position : "+ position);
       }
   }

    public static void main(String arg[]) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("*** Stack Algo and Api Demo ***");
        doPush(stack);
        doPop(stack);
        doPeek(stack);
        doPush(stack);
        doPeek(stack);
        doSearch(stack, 20);
    }
}
