// 5 = 5x4x3x2x1 = 120
class FactorialNumber {
    
    static int result = 1;

    static int displayFactorialNumber(int n) {
        if (n <= 1) return result;
 //       result = n;
       //  result =  n* (n - 1);
//         System.out.println(result);
        return n * displayFactorialNumber(n-1);
    } 
    
    public static void main(String arg[]) {
        int n = 5;
        int fact  = displayFactorialNumber(n);
        System.out.println(fact);
        System.out.println(result);
    }
}
