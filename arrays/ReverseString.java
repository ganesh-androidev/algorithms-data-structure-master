class ReverseString {

    private static String reverseString(String input) {
        int length = input.length();
        char[] c = new char[length];
        // char c[] = input.toCharArray();
        int j = 0;
        System.out.println("String length :"+ length);

        if (input == null && length > 0 ) return "No String";

        for (int i=length - 1; i >= 0;i--) {
            c[j] = input.charAt(i);
            j++;
        }

        return String.valueOf(c);
        //return new String(c);//String.valueOf(c);
    }

    public static void main(String[] arg) {
    final String inputText = "Hello My NAME IS RAM !";
        System.out.println( "Input : " + inputText);
        System.out.println( "Result : " + reverseString(inputText));
        System.out.println( "String Buffer Reverse API" + new StringBuffer(inputText).reverse());
        System.out.println( "String Builder Reverse API" + new StringBuilder(inputText).reverse());
    }
}
