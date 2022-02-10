import java.util.Arrays;
/*Simple Reverse a String Array Program without / wt using Arrays.reverse()*/
class ReverseString {


    private static String[] reverseStringArray(String[] input, int size) {
        String[] output = new String[size];
        int j = 0;
        for (int i= size - 1; i >=0 ;i--) {
           output[j] = input[i];
           j++;
        }
        return output;
    }

    private static String reverseString(String input, int len) {
        String output = "";
        for (int i = len -1; i >=0 ; i--) {
           //  System.out.print(input.charAt(i));
           output += input.charAt(i);
        }
        return output;
    }

    public static void main(String arg[]) {
        String[] input = {"H","E","L","L","O"};
        String inputStr = "CHEERS";
        System.out.println(" INPUT : "+Arrays.toString(input));
        System.out.println(" OUTPUT : "+Arrays.toString(reverseStringArray(input, input.length)));

       // Reverse A String;
        System.out.println(" String Reverse INPUT : " + inputStr);
        System.out.println(" String Reverse OUTPUT : " + reverseString(inputStr, inputStr.length()));
    }
}
