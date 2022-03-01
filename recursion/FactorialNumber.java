//  5! = 5 x 4 x 3 x 2 x 1 = 120

class FactorialNumber {
    
    static int factorial = 1;

    static int findFactorialRecusiver(int number) { // O(n) 
        if (number == 0)  return factorial;
        factorial = factorial * number;
        return findFactorialRecusiver(number - 1);
    }


    static int findFactorialIterative(int number) { // O(n)  since it iterative till N
        factorial = number;

        for (int i = number - 1; i >  0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String arg[]) {
     System.out.println( "findFactorialRecusiver > " + findFactorialRecusiver(5));
        System.out.println( "findFactorialIterartive > " + findFactorialIterative(6));
    }
}

// Time Complexity

