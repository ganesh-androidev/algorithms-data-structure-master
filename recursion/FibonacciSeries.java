/*
Given a number N, we need to find the Fibonacci Series up to the N term.

The Fibonacci series is a series of elements where, the previous two elements are added to get the next element, starting with 0 and 1. 
@author : ganesh.androidev
*/
import java.util.Scanner;

class FibonacciSeries {
    
    static int printFibonaccisNumber(int N) {
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
        int counter = 0;

        while(counter < N) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.println(number3);
            counter++;
        }

        return number3;
    }

    static int num1 = 0;
    static int num2 = 1;

    static int printFibonacciRecursiveShort(int n) {
        if ( n < 2 ) return n;
        System.out.println(" Fib Recussion  n is : "+ n);
        return printFibonacciRecursiveShort(n-1) + printFibonacciRecursiveShort(n-2);
    }

    static int printFibonacciRecursive(int n, int num1,int num2) {
       int sum  = num1 + num2;
        num1 = num2;
        num2 = sum;
        n--;
        if ( n== 0) return sum;

        System.out.println(sum);
        return printFibonacciRecursive(n,num1, num2);
    }

    public static void main(String arg[]) {
        System.out.println( " Enter a Number to Find Fibonaccis Number : ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int result = printFibonaccisNumber(input);
        System.out.println( " printFibonaccisNumber : " + result);

        // Recursive Method
        System.out.println( " Try Recursive Method : ");
        int input2 = scan.nextInt();
        int result2 = printFibonacciRecursive(input2, num1, num2);
        System.out.println( " Recursive printFibonaccisNumber : " + result2);

        // Recursive Method Short
        System.out.println( " Try Recursive Method Short: ");
        int input3 = scan.nextInt();
        // int result3 = printFibonacciRecursiveShort(input3);
        //for (int i =0; i < input3 ; i++ ) {
            System.out.print(printFibonacciRecursiveShort(input3) + " " );
         //}
    }
}
