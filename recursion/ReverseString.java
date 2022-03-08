class ReverseString {

    static String reverseString(String str) {
        char a[] = new char[str.length()];
        String result = ""; 
        for (int i=str.length() -1; i >= 0; i--) {
             result += str.charAt(i);
        }
        System.out.println(" RevereString Result > " + result);
        return result;
    }
    
    static String result = "";

    static  String  reverseStringUsingRecursion(String str) {
        int length = str.length();
        System.out.println(" length > " + length);
        if (length > 0) {
           result += str.charAt(length - 1 );
           reverseStringUsingRecursion(str.substring(0, length -1));
          }
        return result;
    }

    static String reverseStringUsingRecursion2(String str) {
        if (str.length() == 0) return "";

        return (str.charAt(str.length() - 1) 
                + reverseStringUsingRecursion2(str.substring(0,str.length()-1))
                 );
    }

    public static void main(String arg[]) {
       reverseString("HELLO");
       System.out.println( "Recursive Reverser 1 " + reverseStringUsingRecursion("KAUSTAV"));
       System.out.println( "Revser Option 2  " + reverseStringUsingRecursion2("RAM"));
    }
}
