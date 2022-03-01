import java.util.Scanner;

class Palindrome {

    static boolean isPalindrome( int x) {
        String n = Integer.toString(x);
       String s = new StringBuilder(n).reverse().toString();
       StringBuffer sb = new StringBuffer(String.valueOf(n));
       System.out.println(" String Buffer Result " + sb.reverse());

        if(n.equals(s)) {
            return true;
        }
        return false;
    }


    static boolean isPalindrome2( int x) {
        int mod = 0;
        int temp = x;
        int sum = 0;

        while ( x >0 ) {
            mod = x % 10;
            sum = (sum * 10) + mod;
            x = x/10;
        }
        
        if (temp == sum) return true;

        return false;
    }
    
    static int reverseNumber(int x) {
        int input = x;
        int reverse = 0; 
        
        while (input !=0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }

        System.out.println("  Reverse Number is :" + reverse);
        return reverse;
    }
   

    public static void main(String arg[]) {
        // int x = 1234;
        System.out.println("Enter a Number :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println( " Given Nunber" + input + " isPalindrome ? " + isPalindrome(input));
        System.out.println( " Without String Reverse Given Nunber" + input + " isPalindrome ? " + isPalindrome2(input));
        reverseNumber(input);
    }

} 
