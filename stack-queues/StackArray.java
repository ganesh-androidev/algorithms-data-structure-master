/** 
 Demonstrate Stack Push, Pop, Peek, Search Method using Arrays
 Author : @ganesh.androidev
**/

import java.util.ArrayList;
import java.lang.Math;

class StackArray {
    static ArrayList<Integer> stackArrayList =  null;
    
    static void doPushArray() {
        for(int i=1; i<=5; i++) {
            int randomNum = (int) (Math.random() * 10) + i;
            stackArrayList.add(randomNum);
            System.out.println(stackArrayList);
        }
    }

    static void doPeek() {
        int length = stackArrayList.size();
        System.out.println(" Stack Length >> "+ length);
        System.out.println("Top Element in the Stack is " + stackArrayList.get(length -1));
    }

    static void doPop() {
       int length = stackArrayList.size() - 1;
       stackArrayList.remove(length);
    }

    static void doSearch(int value) {
        System.out.println(stackArrayList.contains(value));
        System.out.println(stackArrayList.indexOf(value));

    }

    public static void main(String arg[]) {
        stackArrayList = new ArrayList<>();
        doPushArray();
        doPeek();
        doPushArray();
        doPeek();

        doPop();
        doPeek();
        doSearch(5);
    }
}
