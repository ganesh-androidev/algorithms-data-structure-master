class Fibonacci {

    static void doFibonacci(int n) {
        int x = 0;
        int y = 1;

        while(n >0) {
            int fibno = x + y;
            x = y;
            y = fibno;
            System.out.print(" " + fibno + ",");
            n--; 
        }
// O(n) 
    }

     static int doFibonacciRec(int n) {

        if(n < 2) return n;

        return doFibonacciRec(n-1) + doFibonacciRec(n-2);
     }
    public static void main(String arg[]) {
        int range = 10;
        doFibonacci(range);
        System.out.println( "Fibo number of "+ range + " is " + doFibonacciRec(range));
    }
}
