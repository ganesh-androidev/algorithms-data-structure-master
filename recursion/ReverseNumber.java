class ReverseNumber {
    
    static int reverse(int x, int result) {
        int n = x % 10;
        x = x / 10;
        result = result * 10 + n;
        System.out.println(result);
        if (x <=0) return result;
        return reverse(x, result);
    }
   
    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String arg[]) {
        int input = 12345;
        reverse(input, 0);
        System.out.println(reverse(153423646));
        
    }
}
