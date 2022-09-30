// Encode the Given String and Save 
// input = "aaabbbcccdd";
// output == "a3b3c3d2"
class AmazonEncodeString {

    private static String advancedEncode(String input) {
        int length = input.length();
        // Check for null input 
        if (input == null || length == 0) return "";

        char[] inputChar = input.toCharArray();
        char prevChar = 0;
        int counter = 0;
        StringBuilder result = new StringBuilder();

        // iterate over input
        for(char c : inputChar) {
            if ( c == prevChar) {
                counter++;
            } else {
                if (prevChar != 0) 
                    result.append(counter).append(prevChar);
                prevChar = c;
                counter = 1;
            }

        }

        result.append(counter).append(prevChar);
        System.out.println(" Result : "+ result.toString());
        return result.toString();

    }


    private static String encodeStringNow(String input) {
        int length = input.length();
        char[] charStr = new char[length];
        int counter =1;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< length; i++) {
            charStr[i] = input.charAt(i);
            if(i > 0 && charStr[i] == charStr[i-1]) {
                counter++;
            } else {
                if (counter > 1) {
                    result = result.append(Integer.toString(counter));
                    result = result.append(String.valueOf(charStr[i]));
                    counter = 1;
                } else {
                    result = result.append(String.valueOf(charStr[i]));
                }
            }
        }
        System.out.println(" Result : "+ result.toString());
        return result.toString();
    }


    public static void main(String arg[]) {
        String input = "aaabbcccddde";
        System.out.println(" Input : "+ input);
        // encodeStringNow(input);
        advancedEncode(input);
    }
}
