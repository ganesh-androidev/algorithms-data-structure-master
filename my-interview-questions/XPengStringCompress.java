/*Write a function to compress consecutive duplicate characters from alphanumeric stream of #characters. If you observe any consecutive digits, skip the compression for the digits.
#Following are some sample inputs and output
#eg
# a -> a
# ab -> ab
# aaa -> a3
# abcabc -> abcabc
# ' ' -> ' '
# 123 -> 123
# a1bbc -> a1b2c
# aabbccc -> a2b2c3
# abaa -> aba2
# 111 -> 111 */

class XPengStringCompress {

    static int counter = 1;
    static String result = "";

    private static void doStringCompress(String input) {
        int length = input.length();
        
        for(int i=0; i<=length; i++) {
            if(i > 0 && i < length
                    && !Character.isDigit(input.charAt(i))
                    && input.charAt(i) == input.charAt(i-1)) {
                counter++;
            } else {
                if(counter > 1) {
                   result = result + Integer.toString(counter);
                   counter = 1;
                } // else {
                   // Add the first unique char
                   if (i<length)
                       result = result + String.valueOf(input.charAt(i));
               // }
            }
        }
        
       System.out.println(" Result :" + result); 
    }


    public static void main(String[] arg) {
        String input = "a123bbbc345dd";
        System.out.println(" Input :" + input); 
        doStringCompress(input);


    }
}
