class PowerOf2 {

   static  boolean isPower2(int n) {
        if ( n == 0) {
            return false;
        }

        return ((n & (n-1)) == 0);
    }

    public static void main(String str[]) {
        int input = 32;

        System.out.println(" >>> Given input : " + input);
        boolean mSet = isPower2(input);
        System.out.println("One Line Method  >>> Given input Power 2 is " +mSet );
        
        while (input != 1) {
            System.out.println(input);
            if (input%2 != 0 ) {
                System.out.println(" >>> Given input is NOT a Power of 2 >>>>");
                return;
            }
            input = input / 2;
        }
        System.out.println(" >>> Given input is Power of 2 >>>>");
    }
}
